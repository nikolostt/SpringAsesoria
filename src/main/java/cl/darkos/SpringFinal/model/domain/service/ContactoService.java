package cl.darkos.SpringFinal.model.domain.service;

import cl.darkos.SpringFinal.model.persistence.entity.Contacto;
import cl.darkos.SpringFinal.model.persistence.repository.ContactoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactoService {

    private final ContactoRepository repository;

    public ContactoService(ContactoRepository repository) {
        this.repository = repository;
    }

    public List<Contacto> getAll(){
        return repository.getAll();
    }

    public Optional<Contacto> getOne(int idContacto){
        return repository.getOne(idContacto);
    }

    public Contacto save(Contacto contacto){
        return repository.save(contacto);
    }
}
