package ventas.repositorio;

import java.util.List;

public interface Crud <T> {
    List<T> listar();
    void agregar(T producto);
    void editar(T producto);
    T porId(Integer id);
    void eliminar(Integer id);gi


}
