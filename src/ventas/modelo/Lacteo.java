package ventas.modelo;

import ventas.repositorio.Imprimir;

public class Lacteo extends Producto implements Imprimir {
    private int cantidad;
    private int proteinas;

    public Lacteo(String nombre, double precio, int cantidad, int proteinas){
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getProteinas() {
        return proteinas;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }
    @Override
    public String imprimir() {
        return "Nombre: " + getNombre() +
                ", Precio: $ " + getPrecio() +
                ", Cantidad: " + cantidad +
                ", Proteínas: " + proteinas;
    }

}
