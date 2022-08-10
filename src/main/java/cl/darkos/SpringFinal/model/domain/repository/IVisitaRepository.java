package cl.darkos.SpringFinal.model.domain.repository;

import cl.darkos.SpringFinal.model.persistence.entity.Visita;
import org.springframework.data.repository.CrudRepository;

public interface IVisitaRepository extends CrudRepository<Visita, Integer> {
}
