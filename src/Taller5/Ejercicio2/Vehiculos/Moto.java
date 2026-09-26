package Taller5.Ejercicio2.Vehiculos;

public class Moto extends Vehiculo {

    public String marca;

    public Moto(String tipo, String marca) {
        super(tipo); // Puede llamar al constructor de Vehiculo porque están en el mismo paquete
        this.marca = marca;
    }

    public void infoMoto() {
        System.out.println(
                "INFORMACIÓN DE LA MOTO \n"+
                "Tipo vehiculo: "+ tipo +"\n"+
                "Marca: "+ marca +"\n"
        );
    }

}
