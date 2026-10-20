public class Producto {

    public String nombre;
    public double precio;

    String categoria;
    boolean disponible;

    public Producto(String nombre, double precio, String categoria, boolean disponible){
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.disponible = disponible;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }



}
