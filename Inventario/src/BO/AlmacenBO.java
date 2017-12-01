/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

/**
 *
 * @author Stree
 */
public class AlmacenBO {
    private int IDAlmacen;
    private String Nombre;
    private String Direccion;

    public AlmacenBO(){
        
    }
    
    public AlmacenBO(String Nombre, int ID){
        this.IDAlmacen = ID;
        this.Nombre = Nombre;
    }
    
    /**
     * @return the IDAlmacen
     */
    public int getIDAlmacen() {
        return IDAlmacen;
    }

    /**
     * @param IDAlmacen the IDAlmacen to set
     */
    public void setIDAlmacen(int IDAlmacen) {
        this.IDAlmacen = IDAlmacen;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Direccion
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * @param Direccion the Direccion to set
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    public String toString(){
        return Nombre;
    }
}