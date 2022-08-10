package cl.darkos.SpringFinal.model.persistence.repository;

import cl.darkos.SpringFinal.model.domain.repository.IContactoRepository;
import cl.darkos.SpringFinal.model.persistence.entity.Contacto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ContactoRepository {

    private final IContactoRepository crudRepository;

    public ContactoRepository(IContactoRepository crudRepository) {
        this.crudRepository = crudRepository;
    }

    public List<Contacto> getAll(){
        return (List<Contacto>) crudRepository.findAll();
    }

    public Optional<Contacto> getOne(int idContacto){
        return crudRepository.findById(idContacto);
    }

    public Contacto save(Contacto contacto){
        return crudRepository.save(contacto);
    }

}
