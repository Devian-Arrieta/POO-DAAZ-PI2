package Taller6.Ejercicio3;

public class Banco {

    /*
    protected double saldo; // atributo expuesto

    public Banco(double saldo){
        this.saldo = saldo;
    }
    
    Esta forma no es segura porque cualquier otra clase que se cree dentro de este paquete
    podra modificar directamente la variable saldo y de esa manera es muy vulnerable, y al
    ser protected, cualquier subclase creada en cualquier parte del proyecto puede alterar
    directamente el valor de saldo sin pasar por ninguna validación de saldo disponible o
    montos permitidos, además que como la información es muy sensible, esta nunca debe dejarse
    expuesta a modificaciones directas
    */

    private double saldo;

    public Banco(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
            System.out.println("El saldo inicial no puede ser negativo así que se asignó $0");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    /*
    La mejor manera de proteger el atributo saldo es cambiando su acceso a private y gestionar
    su acceso mediante el metodo get, además de hacer una validación en el constructor para evitar
    errores
    */

}
