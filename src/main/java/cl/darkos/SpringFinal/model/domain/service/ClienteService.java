package cl.darkos.SpringFinal.model.domain.service;


import cl.darkos.SpringFinal.model.persistence.repository.ClienteRepository;
import cl.darkos.SpringFinal.model.persistence.entity.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

   private final ClienteRepository repository;

   public ClienteService(ClienteRepository repository) {
      this.repository = repository;
   }

   public List<Cliente> getAll(){
      return repository.getAll();
   }

   public Optional<Cliente> getOne(int idCliente){
      return repository.getOne(idCliente);
   }


   public Cliente save(Cliente cliente){
      return repository.save(cliente);
   }

}
