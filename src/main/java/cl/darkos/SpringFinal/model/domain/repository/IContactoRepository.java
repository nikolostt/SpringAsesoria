package cl.darkos.SpringFinal.model.domain.repository;

import cl.darkos.SpringFinal.model.persistence.entity.Contacto;
import org.springframework.data.repository.CrudRepository;

public interface IContactoRepository extends CrudRepository<Contacto, Integer> {
}
