
/**
 *
 * @author aaron
 */
package BO;
//librerias


public class ProductoBO {

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the idalmacen
     */
    public int getIdalmacen() {
        return idalmacen;
    }

    /**
     * @param idalmacen the idalmacen to set
     */
    public void setIdalmacen(int idalmacen) {
        this.idalmacen = idalmacen;
    }

    /**
     * @return the idcategoria
     */
    public int getIdcategoria() {
        return idcategoria;
    }

    /**
     * @param idcategoria the idcategoria to set
     */
    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }
    
     //variables de clase
    private int id;
    private String nombre;
    private String descripcion;
    private double unitario;
    private double mayoreo;
    private int cantidad;
    private int idalmacen;
    private int idcategoria;
    private int stock;
    
    //constructor 
    public ProductoBO(){
        
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the unitario
     */
    public double getUnitario() {
        return unitario;
    }

    /**
     * @param unitario the unitario to set
     */
    public void setUnitario(double unitario) {
        this.unitario = unitario;
    }

    /**
     * @return the mayoreo
     */
    public double getMayoreo() {
        return mayoreo;
    }

    /**
     * @param mayoreo the mayoreo to set
     */
    public void setMayoreo(double mayoreo) {
        this.mayoreo = mayoreo;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
   
    
}
