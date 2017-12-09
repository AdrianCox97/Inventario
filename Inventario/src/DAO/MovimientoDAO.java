/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.sun.rowset.CachedRowSetImpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Stree
 */
public class MovimientoDAO {
    
    Conexion con;
    String sql;
    Connection cc;
    
    //constructores     
    public MovimientoDAO(){
        try{
            con = new Conexion();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }  
    
    public CachedRowSetImpl mostrar() throws SQLException{
        
        cc = con.getConexion();
        PreparedStatement ps2 = null;
        sql = "select mov.ClaveBitacora, mov.Usuario, mov.Observaciones, mov.Accion, mov.Fecha, mov.Cantidad, prod.Nombre from movimientos mov \n" +
              "inner join productos prod on mov.ID = prod.ID";
        ResultSet rs = null;
        CachedRowSetImpl crs = null;
        
        try{
            ps2 = cc.prepareStatement(sql);
            rs = ps2.executeQuery();
            
            crs = new CachedRowSetImpl();
            crs.populate(rs);
        }
        catch(SQLException ex){
           Logger.getLogger(MovimientoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            con.cerrarConexion();
        }
        return crs;
    }
}