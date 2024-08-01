package ventas.modelo;

import ventas.repositorio.Imprimir;

public class Fruta extends Producto implements Imprimir {
   private double peso;
   private String color;
   public Fruta(String nombre, double precio, String color, double peso){
       super(nombre, precio);
       this.color = color;
       this.peso = peso;

   }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    @Override
    public String imprimir() {
        return "Nombre: " + getNombre() +
                ", Precio: $ " + getPrecio() +
                ", Color: " + color +
                ", Peso: " + peso;
    }
}
