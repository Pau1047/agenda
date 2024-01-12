package agenda.agenda.servicios;

import agenda.agenda.entidades.Contacto;
import agenda.agenda.repositorios.ContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactoServiceImpl implements ContactoService {

    private final ContactoRepository contactoRepository;

    @Autowired
    public ContactoServiceImpl(ContactoRepository contactoRepository) {
        this.contactoRepository = contactoRepository;
    }

    @Override
    public List<Contacto> obtenerTodos() {
        return contactoRepository.obtenerTodos();
    }

    @Override
    public Contacto obtenerPorId(Long id) {
        return contactoRepository.obtenerPorId(id);
    }

    @Override
    public Contacto guardar(Contacto contacto) {
        return contactoRepository.guardar(contacto);
    }

    @Override
    public void eliminar(Long id) {
        contactoRepository.eliminar(id);
    }

    @Override
    public Contacto modificarContacto(Long id,Contacto contacto) {
        return contactoRepository.modificarContacto(id,contacto);
    }
}
