package ventas;

import ventas.modelo.Fruta;
import ventas.modelo.Lacteo;
import ventas.modelo.Producto;
import ventas.repositorio.BolsaSupermercado;
import ventas.repositorio.Crud;
import ventas.repositorio.Imprimir;

import java.util.List;
import java.util.ArrayList;

public class EjemploBolsa {
    public static void main(String[] args) {
        BolsaSupermercado<Fruta> bolsafrutas = new BolsaSupermercado<>();
        bolsafrutas.agregar(new Fruta("Manzana", 5, "Rojo", 0.30));
        bolsafrutas.agregar(new Fruta("Kiwi", 6,"cafe", 0.80));
        bolsafrutas.agregar(new Fruta("Mango", 2, "amarrillo", 0.90));
        bolsafrutas.agregar(new Fruta("Nance", 0.2, "amarrillo", 0.10));

        mostrarProductos("Frutas", bolsafrutas.listar());

        BolsaSupermercado<Lacteo> bolsalacteo = new BolsaSupermercado<>();
        bolsalacteo.agregar(new Lacteo("Leche entera", 2, 1, 5));
        bolsalacteo.agregar(new Lacteo("Leche deslactosada", 3, 3, 7));
        bolsalacteo.agregar(new Lacteo("Leche descremada", 4, 1, 3));

        mostrarProductos("Lacteos", bolsalacteo.listar());


        System.out.println("****** Modificar ******");
        Fruta banana = new Fruta("Banana", 3,"Amarrilo", 0.9);
        banana.setId(1);
        bolsafrutas.editar(banana);
        Fruta bananaAc = bolsafrutas.porId(3);
       mostrarProductos("Frutas", bolsafrutas.listar());



        System.out.println("****** Eliminar ******");
        bolsafrutas.eliminar(1);
         mostrarProductos("Frutas", bolsafrutas.listar());


    }


    private static <T extends Imprimir>void mostrarProductos(String tipo, List<T> productos) {
        System.out.println("Bolsa de " + tipo + ":");
        for (T producto : productos){
            System.out.println(producto.imprimir());
        }
        System.out.println();
    }
}
