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

}
