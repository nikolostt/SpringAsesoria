package cl.darkos.SpringFinal.model.domain.service;


import cl.darkos.SpringFinal.model.persistence.repository.AdministrativoRepository;
import cl.darkos.SpringFinal.model.persistence.entity.Administrativo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdministrativoService {

   private final AdministrativoRepository repository;

   public AdministrativoService(AdministrativoRepository repository) {
      this.repository = repository;
   }

   public List<Administrativo> getAll(){
      return repository.getAll();
   }

   public Optional<Administrativo> getOne(int idAdministrativo){
      return repository.getOne(idAdministrativo);
   }

   public Administrativo save(Administrativo administrativo){
      return repository.save(administrativo);
   }

}
