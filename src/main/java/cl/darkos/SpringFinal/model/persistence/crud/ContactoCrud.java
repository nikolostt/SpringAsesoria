package cl.darkos.SpringFinal.model.persistence.crud;

import cl.darkos.SpringFinal.model.persistence.entity.Contacto;
import org.springframework.data.repository.CrudRepository;

public interface ContactoCrud extends CrudRepository<Contacto, Integer> {
}
