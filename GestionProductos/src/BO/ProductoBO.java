
/**
 *
 * @author aaron
 */
package BO;
//librerias


public class ProductoBO {
    
     //variables de clase
    private int id;
    private String nombre;
    private String descripcion;
    private double unitario;
    private double mayoreo;
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
