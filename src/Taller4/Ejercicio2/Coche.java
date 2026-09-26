package Taller4.Ejercicio2;

public class Coche {

    private String marca, modelo;
    private double velocidadMaxima;

    public Coche(String marca, String modelo, double velocidadMaxima){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public double getVelocidadMaxima(){
        return velocidadMaxima;
    }

    public void acelerar(double incremento){
        if (incremento > 0){
            velocidadMaxima += incremento;
            System.out.println("Velocidad incrementada, nueva velocidad máxima: " + velocidadMaxima + " km/h");
        }
        else{
            System.out.println("El incremento debe ser un valor positivo, por favor ingresar un valor valido");
        }
    }

    public void mostrarInformacion(){
        System.out.println(
                "INFORMACIÓN DEL COCHE \n"+
                "Marca: "+ marca +"\n"+
                "Modelo: "+ modelo +"\n"+
                "Velocidad Máxima: "+ velocidadMaxima +" km/h \n"
        );
    }
}
