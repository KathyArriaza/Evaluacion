package ventas.modelo;

import ventas.repositorio.Imprimir;

public class NoPerecible extends Producto implements Imprimir {
    private int contenido;
    private int calorias;

    public NoPerecible(String nombre, double precio, int contenido, int calorias){
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }


    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    @Override
    public String imprimir() {
        return "Nombre: " + getNombre() +
                ", Precio: " + getPrecio() +
                ", Contenido: " + contenido +
                ", Calorías: " + calorias;
    }

}
