package Taller5.Ejercicio3;

public class Main6 {
    public static void main(String[] args) {

        Persona persona = new Persona("Devian", 19);

        persona.edad = 23; // edad es accesible porque este archivo está en el mismo paquete
        System.out.println("Edad: " + persona.edad);

        // persona.nombre = "Ana"; // 'nombre' has private access in 'Taller5.Ejercicio3.Persona'
        // como nombre es privado, no se puede acceder a el directamente

        persona.setNombre("Dimitrio"); // forma correcta de alterar el atributo privado atravez del metodo set
        System.out.println("Nombre: " + persona.getNombre());
    }
}
