/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
//librerias 
import java.sql.SQLException;
import BO.ProductoBO;
import com.sun.rowset.CachedRowSetImpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public int guardar(ProductoBO prod){
        int retorno = 0;
        cc = con.getConexion();
        PreparedStatement ps = null;
        sql = "INSERT INTO producto (nombre, descripcion, p_unitario, p_mayoreo, stock ) VALUES (?, ?, ?, ?, ?)";
        
        //capturador de errores
        try{
            ps = cc.prepareStatement(sql);
            
            ps.setString(1, prod.getNombre());
            ps.setString(2, prod.getDescripcion());
            ps.setDouble(3, prod.getUnitario());
            ps.setDouble(4, prod.getMayoreo());
            ps.setInt(5, prod.getStock());
            
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
    
    public CachedRowSetImpl mostrar() throws SQLException{
        
        cc = con.getConexion();
        PreparedStatement ps = null;
        sql = "SELECT ID, nombre, descripcion, p_unitario, p_mayoreo, stock FROM producto";
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
