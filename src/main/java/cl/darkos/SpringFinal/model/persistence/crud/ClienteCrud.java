package cl.darkos.SpringFinal.model.persistence.crud;

import cl.darkos.SpringFinal.model.persistence.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteCrud extends CrudRepository<Cliente, Integer> {
}
