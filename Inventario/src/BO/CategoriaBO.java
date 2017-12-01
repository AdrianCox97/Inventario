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
public class CategoriaBO {
    private int IDCategoria;
    private String Nombre;

    /**
     * @return the IDCategoria
     */
    public int getIDCategoria() {
        return IDCategoria;
    }

    /**
     * @param IDCategoria the IDCategoria to set
     */
    public void setIDCategoria(int IDCategoria) {
        this.IDCategoria = IDCategoria;
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
}