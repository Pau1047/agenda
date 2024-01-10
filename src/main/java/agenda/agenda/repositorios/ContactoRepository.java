package agenda.agenda.repositorios;

import agenda.agenda.entidades.Contacto;
import java.util.List;

public interface ContactoRepository {
    List<Contacto> obtenerTodos();
    Contacto obtenerPorId(Long id);
    Contacto guardar(Contacto contacto);
    void eliminar(Long id);
}
