package cl.darkos.SpringFinal.model.domain.repository;


import cl.darkos.SpringFinal.model.persistence.entity.Administrativo;
import org.springframework.data.repository.CrudRepository;

public interface IAdministrativoRepository extends CrudRepository<Administrativo, Integer> {
}
