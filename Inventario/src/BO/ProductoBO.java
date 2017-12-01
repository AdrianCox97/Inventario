/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

/**
 *
 * @author aaron
 */
public class ProductoBO {
    private int ID;
    private String Nombre;
    private String Descripcion;
    private double PrecioUnitario;
    private double PrecioMayoreo;
    private int Cantidad;
    private int IDAlmacen;
    private int IDCategoria;
    private int Stock;

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
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
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    /**
     * @return the PrecioUnitario
     */
    public double getPrecioUnitario() {
        return PrecioUnitario;
    }

    /**
     * @param PrecioUnitario the PrecioUnitario to set
     */
    public void setPrecioUnitario(double PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }

    /**
     * @return the PrecioMayoreo
     */
    public double getPrecioMayoreo() {
        return PrecioMayoreo;
    }

    /**
     * @param PrecioMayoreo the PrecioMayoreo to set
     */
    public void setPrecioMayoreo(double PrecioMayoreo) {
        this.PrecioMayoreo = PrecioMayoreo;
    }

    /**
     * @return the Cantidad
     */
    public int getCantidad() {
        return Cantidad;
    }

    /**
     * @param Cantidad the Cantidad to set
     */
    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
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
     * @return the Stock
     */
    public int getStock() {
        return Stock;
    }

    /**
     * @param Stock the Stock to set
     */
    public void setStock(int Stock) {
        this.Stock = Stock;
    }
}