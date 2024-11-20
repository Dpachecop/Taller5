package Taller5.Ejercicio2.vehiculos;


public class Moto extends Vehiculo {
    public Moto() {
        super();
        this.tipo = "Moto";
    }

    public void mostrarTipo() {
        System.out.println("El tipo de vehículo es: " + tipo);
    }
}