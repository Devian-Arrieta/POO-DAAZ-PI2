package Taller6.Ejercicio1;

public class Gerente extends Empleado {

    private String departamento;

    public Gerente(String nombre, double salario, String departamento){
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override // sobreescribe el metodo
    public void mostrarInfo(){
        System.out.println(
                "INFORMACIÓN \n"+
                "Nombre: "+ nombre +"\n"+
                "Salario: "+ salario +"\n"+
                "Departamento: "+ departamento +"\n"
        );
    }
}
