package cl.darkos.SpringFinal.model.domain.repository;


import cl.darkos.SpringFinal.model.persistence.entity.Profesional;
import org.springframework.data.repository.CrudRepository;

public interface IProfesionalRepository extends CrudRepository<Profesional, Integer> {
}
