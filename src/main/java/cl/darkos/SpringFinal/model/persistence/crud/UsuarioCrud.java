package cl.darkos.SpringFinal.model.persistence.crud;

import cl.darkos.SpringFinal.model.persistence.entity.UsuarioEntity;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioCrud extends CrudRepository<UsuarioEntity, String> {
    boolean existsByUsername(String username);
}
