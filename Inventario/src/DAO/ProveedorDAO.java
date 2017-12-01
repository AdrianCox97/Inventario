/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BO.ProveedorBO;
import com.sun.rowset.CachedRowSetImpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aaron
 */
public class ProveedorDAO {
    Conexion con;
    String sql;
    Connection cc;
      
    public ProveedorDAO(){
        try{
            con = new Conexion();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }        
    
    public int guardar(ProveedorBO OBProveedor){
        int retorno = 0;
        cc = con.getConexion();
        PreparedStatement ps = null;
        sql = "insert into proveedores (Nombre, ApellidoPaterno, ApellidoMaterno, RFC, Direccion, Telefono, Celular, Email) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        //capturador de errores
        try{
            ps = cc.prepareStatement(sql);
            
            ps.setString(1, OBProveedor.getNombre());
            ps.setString(2, OBProveedor.getApellidoP());
            ps.setString(3, OBProveedor.getApellidoM());
            ps.setString(4, OBProveedor.getRFC());
            ps.setString(5, OBProveedor.getDireccion());
            ps.setString(6, OBProveedor.getTelefono());
            ps.setString(7, OBProveedor.getCelular());
            ps.setString(8, OBProveedor.getEmail());
            
            retorno = ps.executeUpdate();
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
    
    public int editar(ProveedorBO OBProveedor) throws SQLException{
        int retorno = 0;
        cc = con.getConexion();
        PreparedStatement ps = null;
        sql = "update proveedores set Nombre = (?), ApellidoPaterno = (?), ApellidoMaterno = (?), RFC = (?), Direccion = (?),  Telefono = (?), Celular= (?), Email= (?) where IDProveedor = (?)";
        
        try{
            ps = cc.prepareStatement(sql);
            
            ps.setString(1, OBProveedor.getNombre());
            ps.setString(2, OBProveedor.getApellidoP());
            ps.setString(3, OBProveedor.getApellidoM());
            ps.setString(4, OBProveedor.getRFC());
            ps.setString(5, OBProveedor.getDireccion());
            ps.setString(6, OBProveedor.getTelefono());
            ps.setString(7, OBProveedor.getCelular());
            ps.setString(8, OBProveedor.getEmail());
            ps.setInt(9, OBProveedor.getID());
            
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
    
    public int eliminar(ProveedorBO OBProveedor) throws SQLException {
        int retorno = 0;
        cc = con.getConexion();
        sql = "delete from proveedores where IDProveedor = (?)";
        PreparedStatement ps = null;
        
        try{
            ps = cc.prepareStatement(sql);
            ps.setInt(1, OBProveedor.getID());
            
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
        PreparedStatement ps = null;
        sql = "select IDProveedor, Nombre, ApellidoPaterno, ApellidoMaterno, RFC, Direccion, Telefono, Celular, Email from proveedores";
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
}