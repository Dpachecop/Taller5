package Taller5.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("Laptop", 1200.50, 10);

      
        producto.mostrarInfo();

        
        producto.nombre = "Smartphone";
        producto.precio = 850.75;
        producto.stock = 25;

        System.out.println("Detalles actualizados del producto:");
        producto.mostrarInfo();
    }
}

