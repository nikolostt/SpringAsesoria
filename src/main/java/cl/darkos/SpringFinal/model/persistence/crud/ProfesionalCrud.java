package cl.darkos.SpringFinal.model.persistence.crud;

import cl.darkos.SpringFinal.model.persistence.entity.Profesional;
import org.springframework.data.repository.CrudRepository;

public interface ProfesionalCrud extends CrudRepository<Profesional, Integer> {
}
