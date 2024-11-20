package Taller5.Ejercicio3.personas;



public class Persona {
    private String nombre;  // Atributo privado
    int edad;  // Atributo de paquete

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

