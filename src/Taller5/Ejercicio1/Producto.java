package Taller5.Ejercicio1;

class Producto {

    String nombre;
    double precio;
    int stock;

    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    void mostrarInfo(){
        System.out.println(
                "INFORMACIÓN DEL PRODUCTO \n"+
                "Nombre: "+ nombre +"\n"+
                "Precio: "+ precio +"\n"+
                "Stock: "+ stock +"\n"
        );
    }
}
