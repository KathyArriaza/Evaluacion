package ventas.modelo;

import ventas.repositorio.Imprimir;

public class Limpieza extends Producto implements Imprimir {
    private String componentes;
    private double litros;

    public Limpieza(String nombre, double precio, String componentes, double litros){
        super(nombre, precio);
        this.componentes = componentes;
        this.litros = litros;
    }

    public String getComponentes() {
        return componentes;
    }

    public void setComponentes(String componentes) {
        this.componentes = componentes;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    @Override
    public String imprimir() {
        return "Nombre: " + getNombre()
                + ", Precio: $" + getPrecio() +
                ", Componentes: " + componentes +
                ", Litros: " + litros;
    }

}
