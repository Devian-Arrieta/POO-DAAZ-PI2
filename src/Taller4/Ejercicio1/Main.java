import Taller4.Ejercicio1.Estudiante;

void main() {

    Estudiante estudiante1 = new Estudiante("Devian Arrieta", 19, 4.5);

    estudiante1.mostrarInformacion();

    estudiante1.setEdad(20);
    estudiante1.setNotaPromedio(5);

    System.out.print("ESTUDIANTE 1 ACTUALIZADO: ");
    estudiante1.mostrarInformacion();
}
