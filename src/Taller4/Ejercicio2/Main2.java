import Taller4.Ejercicio2.Coche;

void main() {

    Coche coche1 = new Coche("Koenigsegg", "Jesko Absolut", 531);

    coche1.mostrarInformacion();

    coche1.acelerar(10);

    System.out.print("COCHE 1 + VELOCIDAD: ");
    coche1.mostrarInformacion();
}