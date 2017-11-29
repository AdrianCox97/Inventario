/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.SQLException;
import BO.AlmacenBO;
import com.sun.rowset.CachedRowSetImpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Stree
 */
public class AlmacenDAO {
    Conexion con;
    String sql;
    Connection cc;
      
    public AlmacenDAO(){
        try{
            con = new Conexion();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }        
    
    public int guardar(AlmacenBO OBAlmacen){
        int retorno = 0;
        cc = con.getConexion();
        PreparedStatement ps = null;
        sql = "insert into almacenes (nombre, direccion) values (?, ?)";
        
        //capturador de errores
        try{
            ps = cc.prepareStatement(sql);
            
            ps.setString(1, OBAlmacen.getNombre());
            ps.setString(2, OBAlmacen.getDireccion());
            
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
    
    public int editar(AlmacenBO OBAlmacen) throws SQLException{
        int retorno = 0;
        cc = con.getConexion();
        PreparedStatement ps = null;
        sql = "update almacenes set nombre = (?), direccion = (?) where idalmacen = (?) ";
        
        try{
            ps = cc.prepareStatement(sql);
            
            ps.setString(1, OBAlmacen.getNombre());
            ps.setString(2, OBAlmacen.getDireccion());
            ps.setInt(3, OBAlmacen.getIDAlmacen());
            
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
    
    public int eliminar(AlmacenBO OBAlmacen) throws SQLException {
        int retorno = 0;
        cc = con.getConexion();
        sql = "delete from almacenes where IDAlmacen = (?)";
        PreparedStatement ps = null;
        
        try{
            ps = cc.prepareStatement(sql);
            ps.setInt(1, OBAlmacen.getIDAlmacen());
            
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
        sql = "select idalmacen, nombre, direccion from almacenes";
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