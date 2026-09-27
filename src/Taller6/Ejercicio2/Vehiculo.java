package Taller6.Ejercicio2;

public class Vehiculo {

    protected String tipo, marca;

    public Vehiculo(String tipo, String marca){
        this.tipo = tipo;
        this.marca = marca;
    }

    public void mostrarInfoVehiculo(){
        System.out.println(
                "INFORMACIÓN VEHICULO \n"+
                "Tipo: "+ tipo +"\n"+
                "Marca: "+ marca +"\n"
        );
    }
}
