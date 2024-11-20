package Taller5.Ejercicio2.pruebas;

import Taller5.Ejercicio2.vehiculos.Moto;

public class PruebaVehiculo {
    public static void main(String[] args) {
        Moto miMoto = new Moto();
        miMoto.mostrarTipo(); 
        // aqui todo funciona bien por que se esta accediendo al metodo mostrartipo 

        // Intentar acceder directamente a la propiedad tipo desde fuera del paquete:
        // System.out.println(miMoto.tipo);  Sale el siguiente error: 'tipo' has protected access in 'vehiculos.Vehiculo'
    }
}