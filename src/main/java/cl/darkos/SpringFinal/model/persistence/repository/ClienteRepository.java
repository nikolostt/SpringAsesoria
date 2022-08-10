package cl.darkos.SpringFinal.model.persistence.repository;


import cl.darkos.SpringFinal.model.domain.repository.IClienteRepository;
import cl.darkos.SpringFinal.model.persistence.entity.Cliente;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClienteRepository {


   private final IClienteRepository crudRepository;

   public ClienteRepository(IClienteRepository crudRepository) {
      this.crudRepository = crudRepository;
   }

   public List<Cliente> getAll(){
      return (List<Cliente>) crudRepository.findAll();
   }

   public Optional<Cliente> getOne(int idCliente){
      return crudRepository.findById(idCliente);
   }


   public Cliente save(Cliente cliente){
      return crudRepository.save(cliente);
   }


}
