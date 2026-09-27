import Taller6.Ejercicio2.Moto;
import Taller6.Ejercicio2.Vehiculo;

void main() {

    Vehiculo vehiculo1 = new Vehiculo("Terrestre", "Boxer");
    Moto moto1 = new Moto("Moto", "Zuzuki", 250);

    /*
    System.out.println(vehiculo1.tipo); // 'tipo' has protected access in 'Taller6.Ejercicio2.Vehiculo'
    System.out.println(vehiculo1.marca);  // 'marca' has protected access in 'Taller6.Ejercicio2.Vehiculo'
    */
    vehiculo1.mostrarInfoVehiculo();

    // System.out.println(moto1.tipo); // 'tipo' has protected access in 'Taller6.Ejercicio2.Vehiculo'
    moto1.mostrarInfoMoto();
}