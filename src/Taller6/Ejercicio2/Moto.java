package Taller6.Ejercicio2;

public class Moto extends Vehiculo {

    protected double cilindrada;

    public Moto(String tipo, String marca, double cilindrada){
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

    public void mostrarInfoMoto(){
        System.out.println(
                "INFORMACIÓN MOTO \n"+
                "Tipo: "+ tipo +"\n"+
                "Marca: "+ marca +"\n"+
                "Cilindrada: "+ cilindrada +"\n"
        );
    }
}
