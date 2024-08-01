package ventas.repositorio;

import ventas.modelo.Producto;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado <T extends Producto> implements Crud<T> {
    private List<T> productos;
    private final int MAX_PRODUCTOS = 5;

    public BolsaSupermercado(){
        productos = new ArrayList<>();
    }


    @Override
    public List<T> listar() {
        return productos;
    }

    @Override
    public void agregar(T producto) {
        if (productos.size() <MAX_PRODUCTOS){
            productos.add(producto);
        } else {
            System.out.println("Bolsa llena, no se puede agregar mas productos");
        }
    }

    @Override
    public void editar(T producto) {
        Producto p = this.porId(producto.getId());
        p.setNombre(producto.getNombre());
        p.setPrecio(producto.getPrecio());

    }

    @Override
    public T porId(Integer id) {
        T resultado = null;
        for (T cli: productos){
            if (cli.getId() != null && cli.getId().equals(id)){
                resultado = cli;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void eliminar(Integer id) {
        this.productos.remove(this.porId(id));

    }
}
