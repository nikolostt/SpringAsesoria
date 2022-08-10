package cl.darkos.SpringFinal.model.persistence.repository;

import cl.darkos.SpringFinal.model.domain.dto.UserDTO;
import cl.darkos.SpringFinal.model.domain.repository.UserDTORepository;
import cl.darkos.SpringFinal.model.persistence.crud.UsuarioCrud;
import cl.darkos.SpringFinal.model.persistence.entity.UsuarioEntity;
import cl.darkos.SpringFinal.model.persistence.mapper.UserMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UsuarioRepository implements UserDTORepository {
    private final UsuarioCrud crud;
    private final UserMapper mapper;

    public UsuarioRepository(UsuarioCrud crud, UserMapper mapper) {
        this.crud = crud;
        this.mapper = mapper;
    }


    @Override
    public Optional<List<UserDTO>> findAll() {
        return Optional.of(mapper.toUsers((List<UsuarioEntity>) crud.findAll()));
    }

    @Override
    public Optional<UserDTO> findById(String username) {
        return crud.findById(username)
                .map(mapper::toUser);
    }

    @Override
    public UserDTO save(UserDTO user) {
        return mapper.toUser(crud.save(mapper.toUsuario(user)));
    }

    @Override
    public void delete(String username) {
        crud.deleteById(username);
    }

    @Override
    public boolean existsByUsername(String username) {
        return crud.existsByUsername(username);
    }
}
