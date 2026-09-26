package Taller4.Ejercicio3;

public class Coche {

    private String marca, modelo;
    private double velocidadMaxima;

    public Coche(String marca, String modelo, double velocidadMaxima){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }
     /*
     Los atributos están protegidos, pero resultan inútiles para el resto del
     programa al no haber forma de consultar su valor, tampoco es posible actualizar
     la información del objeto después de haber sido instanciado.
     */
}
