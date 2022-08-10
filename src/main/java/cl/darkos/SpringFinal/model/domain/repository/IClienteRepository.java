package cl.darkos.SpringFinal.model.domain.repository;



import cl.darkos.SpringFinal.model.persistence.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteRepository extends CrudRepository<Cliente, Integer> {
}
