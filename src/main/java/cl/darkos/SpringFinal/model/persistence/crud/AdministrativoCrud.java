package cl.darkos.SpringFinal.model.persistence.crud;

import cl.darkos.SpringFinal.model.persistence.entity.Administrativo;
import org.springframework.data.repository.CrudRepository;

public interface AdministrativoCrud extends CrudRepository<Administrativo, Integer> {
}
