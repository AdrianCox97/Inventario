/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author aaron
 */
public class Conexion {
    //variables de la clase
    static String usuario = "root";
    static String contraseña = "admin1234";
    static String ssl = "useSSL=false";
    static String url = "jdbc:mysql://localhost/erp?useSSL=false";
    static Connection con;
    
    //constructor de la clase
    public Conexion() throws SQLException
    {
        //capturador de errores
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, usuario, contraseña );
                       
        }//fin try
        catch(ClassNotFoundException ex){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }//fin catch
    }//Fin constructor
    
    //método para retornar la conexión
    public Connection getConexion(){
        return con;
    }//fin getConnection
    
    //método para cerrar conexion
    public void cerrarConexion() throws SQLException {
        con.close();
    }//fin cerrarConexion
}