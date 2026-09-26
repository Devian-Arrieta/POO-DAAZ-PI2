package Taller4.Ejercicio1;

public class Estudiante {

    private String nombre;
    private int edad;
    private double notaPromedio;

    public Estudiante(String nombre, int edad, double notaPromedio){
        this.nombre = nombre;
        this.edad = edad;
        this.notaPromedio = notaPromedio;
    }


    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        if (nombre != null && !nombre.trim().isEmpty()){ // valida nombre vacio y sin espacios
            this.nombre = nombre;
        }
        else{
            System.out.println("El nombre no puede estar vacio, ingresa un nombre valido");
        }
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0){
            this.edad = edad;
        }
        else{
            System.out.println("La edad no puede ser un número negativo, ingresa una edad valida");
        }
    }


    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio >= 0 && notaPromedio <= 5) {
            this.notaPromedio = notaPromedio;
        }
        else{
            System.out.println("La nota promedio debe estar entre 0.0 y 5.0, ingresa una nota valida");
        }
    }


    public void mostrarInformacion(){
        System.out.println(
                "INFORMACIÓN ESTUDIANTE \n"+
                "Nombre: "+ nombre +"\n"+
                "Edad: "+ edad +"\n"+
                "Nota Promedio: "+ notaPromedio +"\n"
        );
    }

}
