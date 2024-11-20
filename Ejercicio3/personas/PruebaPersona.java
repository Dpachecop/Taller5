package Taller5.Ejercicio3.personas;



public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona = new Persona("Carlos", 30);

        // Acceso al atributo privado 'nombre' a través de métodos get y set
        System.out.println("Nombre: " + persona.getNombre());  // Funciona porque se accede mediante el método público 'getNombre'
        persona.setNombre("Dani daniel");
        System.out.println("Nuevo nombre: " + persona.getNombre());

      
        System.out.println("Edad: " + persona.edad);  // Funciona porque 'PruebaPersona' está en el mismo paquete
    }
}

//EXPLICACION:
/*Los atributos private solo son accesibles dentro de la clase donde se declaran, 
lo que protege los datos y garantiza el encapsulamiento usando métodos get y set para el acceso externo.
 Los atributos de paquete (sin modificador) permiten el acceso desde cualquier clase del mismo paquete,
  lo cual facilita la interacción entre clases relacionadas, pero ofrece menos
 control y seguridad sobre los datos.
*/
