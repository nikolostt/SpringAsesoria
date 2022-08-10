package cl.darkos.SpringFinal.model.persistence.crud;

import cl.darkos.SpringFinal.model.persistence.entity.Pago;
import org.springframework.data.repository.CrudRepository;

public interface PagoCrud extends CrudRepository<Pago, Integer> {
}

