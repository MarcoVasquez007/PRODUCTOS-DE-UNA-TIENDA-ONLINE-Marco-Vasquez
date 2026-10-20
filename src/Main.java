public class Main{
    public static void main(String[] args){

        Producto producto1 = new Producto("Apple pencil", 25.0, "Apple", true);

        System.out.println(producto1.nombre);
        System.out.println(producto1.precio);
        System.out.println(producto1.categoria);
        System.out.println(producto1.disponible);

    }
}