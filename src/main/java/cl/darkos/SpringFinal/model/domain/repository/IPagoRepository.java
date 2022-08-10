package cl.darkos.SpringFinal.model.domain.repository;


import cl.darkos.SpringFinal.model.persistence.entity.Pago;
import org.springframework.data.repository.CrudRepository;

public interface IPagoRepository extends CrudRepository<Pago, Integer> {
}
