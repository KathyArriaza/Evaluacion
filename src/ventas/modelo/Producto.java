package ventas.modelo;

import ventas.repositorio.Imprimir;

public class Producto extends BaseEntity implements Imprimir {
    protected String nombre;
    protected double precio;

    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    @Override
    public String imprimir() {
        return "Nombre: " + getNombre() +
                ", Precio: " + getPrecio();
    }
}
