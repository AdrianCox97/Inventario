/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.SQLException;
import BO.CategoriaBO;
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
public class CategoriaDAO {
    Conexion con;
    String sql;
    Connection cc;
      
    public CategoriaDAO(){
        try{
            con = new Conexion();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }        
    
    public int guardar(CategoriaBO OBCategoria){
        int retorno = 0;
        cc = con.getConexion();
        PreparedStatement ps = null;
        sql = "insert into categorias (nombre) values (?)";
        
        //capturador de errores
        try{
            ps = cc.prepareStatement(sql);
            
            ps.setString(1, OBCategoria.getNombre());
            
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
                Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return retorno;
    }
    
    public int editar(CategoriaBO OBCategoria) throws SQLException{
        int retorno = 0;
        cc = con.getConexion();
        PreparedStatement ps = null;
        sql = "update categorias set nombre = (?) where idcategoria = (?) ";
        
        try{
            ps = cc.prepareStatement(sql);
            
            ps.setString(1, OBCategoria.getNombre());
            ps.setInt(2, OBCategoria.getIDCategoria());
            
            retorno = ps.executeUpdate();
            ps.close();
            
        }   
        catch(SQLException ex){
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex); 
        }
        finally{
            con.cerrarConexion();
            cc.close();
        }
        return retorno;
    }
    
    public int eliminar(CategoriaBO OBCategoria) throws SQLException {
        int retorno = 0;
        cc = con.getConexion();
        sql = "delete from categorias where idcategoria = (?)";
        PreparedStatement ps = null;
        
        try{
            ps = cc.prepareStatement(sql);
            ps.setInt(1, OBCategoria.getIDCategoria());
            
            retorno = ps.executeUpdate();
            ps.close();
        }
        catch(SQLException ex){
           Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex); 
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
        sql = "select idcategoria, nombre from categorias";
        ResultSet rs = null;
        CachedRowSetImpl crs = null;
        
        try{
            ps = cc.prepareStatement(sql);
            rs = ps.executeQuery();
            
            crs = new CachedRowSetImpl();
            crs.populate(rs);
        }
        catch(SQLException ex){
           Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            con.cerrarConexion();
        }
        return crs;
    }
}