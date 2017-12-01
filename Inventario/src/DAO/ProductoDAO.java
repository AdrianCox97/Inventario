/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.SQLException;
import BO.ProductoBO;
import com.sun.rowset.CachedRowSetImpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author aaron
 */
public class ProductoDAO {
    //variables de la clase
    Conexion con;
    String sql;
    Connection cc;
    
    //constructores     
    public ProductoDAO(){
        try{
            con = new Conexion();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }        
    
    
    //métodos
    public int guardar(ProductoBO prod, String NomCateg, String NomAlm){
        int retorno = 0;
        int idCat = 0, idAlm = 0;
        
        try{
        CachedRowSetImpl crsCat = this.obtenerIDs("IDCategoria", "Nombre", "categorias", NomCateg);
            while(crsCat.next()){
                idCat = crsCat.getInt("IDCategoria");
            }
            
            CachedRowSetImpl crsAlm = this.obtenerIDs("IDAlmacen", "Nombre", "almacenes", NomAlm);
            while(crsAlm.next()){
                idAlm = crsAlm.getInt("IDAlmacen");
            }
        } catch (SQLException exS) {
        
        }
        cc = con.getConexion();
        PreparedStatement ps = null;
        sql = "insert into productos (nombre, descripcion, preciounitario, preciomayoreo, cantidad,  stock, idalmacen, idcategoria ) values ("
                + "'"+prod.getNombre()+"', '"+prod.getDescripcion()+"', "+prod.getPrecioUnitario()+", "+prod.getPrecioMayoreo()+", "+prod.getCantidad()+", "+prod.getStock()+", "+idAlm+", "+idCat+")";
        //capturador de errores
        try{
            ps = cc.prepareStatement(sql);
            
            retorno = ps.executeUpdate(sql);
            ps.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try {
                cc.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return retorno;
    }
    
    public int editar(ProductoBO prod, String NomCateg, String NomAlm) throws SQLException{
        int retorno = 0;
        int idCat = 0, idAlm = 0;
        
        try{
        CachedRowSetImpl crsCat = this.obtenerIDs("IDCategoria", "Nombre", "categorias", NomCateg);
            while(crsCat.next()){
                idCat = crsCat.getInt("IDCategoria");
            }
            
            CachedRowSetImpl crsAlm = this.obtenerIDs("IDAlmacen", "Nombre", "almacenes", NomAlm);
            while(crsAlm.next()){
                idAlm = crsAlm.getInt("IDAlmacen");
            }
        } catch (SQLException exS) {
        
        }
        
        cc = con.getConexion();
        PreparedStatement ps = null;
        sql = "update productos set "
                + "nombre = '"+prod.getNombre()+"', "
                + "descripcion = '"+prod.getDescripcion()+"', "
                + "preciounitario = "+prod.getPrecioUnitario()+", "
                + "preciomayoreo = "+prod.getPrecioMayoreo()+","
                + " cantidad = "+prod.getCantidad()+",  "
                + "stock = "+prod.getStock()+", "
                + "idalmacen= "+idAlm+", "
                + "idcategoria= "+idCat+" where ID = "+prod.getID()+" ";
        
        try{
            ps = cc.prepareStatement(sql);
            
            retorno = ps.executeUpdate();
            ps.close();
            
        }   
        catch(SQLException ex){
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex); 
        }
        finally{
            con.cerrarConexion();
            cc.close();
        }
        return retorno;
    }
    
    public int eliminar(ProductoBO producto) throws SQLException {
        int retorno = 0;
        cc = con.getConexion();
        sql = "delete from productos where ID=(?)";
        PreparedStatement ps = null;
        
        try{
            ps = cc.prepareStatement(sql);
            ps.setInt(1, producto.getID());
            
            retorno = ps.executeUpdate();
            ps.close();
        }
        catch(SQLException ex){
           Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex); 
        }
        finally{
            con.cerrarConexion();
            cc.close();
        }
        return retorno;
    }
    
    public CachedRowSetImpl mostrar() throws SQLException{
        
        cc = con.getConexion();
        PreparedStatement ps2 = null;
        sql = "select prod.ID, prod.Nombre, prod.descripcion, prod.preciounitario, prod.preciomayoreo, prod.cantidad, prod.stock, cat.Nombre, alm.Nombre \n" +
              "from productos prod \n" +
              "inner join almacenes alm on prod.IDAlmacen = alm.IDAlmacen \n" +
              "inner join categorias cat on prod.IDCategoria = cat.IDCategoria";
        ResultSet rs = null;
        CachedRowSetImpl crs = null;
        
        try{
            ps2 = cc.prepareStatement(sql);
            rs = ps2.executeQuery();
            
            crs = new CachedRowSetImpl();
            crs.populate(rs);
        }
        catch(SQLException ex){
           Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            con.cerrarConexion();
        }
        return crs;
    }
    
    public CachedRowSetImpl obtenerCategorias() throws SQLException{
        cc = con.getConexion();
        PreparedStatement ps = null;
        sql = "select IDCategoria, Nombre from categorias";
        ResultSet rs = null;
        CachedRowSetImpl crs = null;
        
        try{
            ps = cc.prepareStatement(sql);
            rs = ps.executeQuery();
            
            crs = new CachedRowSetImpl();
            crs.populate(rs);
        }
        catch(SQLException ex){
           Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            con.cerrarConexion();
        }
        return crs;
    }
    
    public CachedRowSetImpl obtenerAlmacenes() throws SQLException{
        
        cc = con.getConexion();
        PreparedStatement ps = null;
        sql = "select IDAlmacen, Nombre from almacenes";
        ResultSet rs = null;
        CachedRowSetImpl crs = null;
        
        try{
            ps = cc.prepareStatement(sql);
            rs = ps.executeQuery();
            
            crs = new CachedRowSetImpl();
            crs.populate(rs);
        }
        catch(SQLException ex){
           Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            con.cerrarConexion();
        }
        return crs;
    }
    
    private CachedRowSetImpl obtenerIDs(String ID, String Campo, String Tabla, String dato) throws SQLException{
        
        cc = con.getConexion();
        PreparedStatement ps = null;
        sql = "select " + ID + " from " + Tabla + " where " + Campo + " = '" + dato + "'";
        ResultSet rs = null;
        CachedRowSetImpl crs = null;
        
        try{
            ps = cc.prepareStatement(sql);
            
            rs = ps.executeQuery();
            
            crs = new CachedRowSetImpl();
            crs.populate(rs);
        }
        catch(SQLException ex){
           Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return crs;
    }
}