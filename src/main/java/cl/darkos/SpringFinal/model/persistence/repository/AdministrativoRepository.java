package cl.darkos.SpringFinal.model.persistence.repository;

import cl.darkos.SpringFinal.model.domain.repository.IAdministrativoRepository;
import cl.darkos.SpringFinal.model.persistence.entity.Administrativo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AdministrativoRepository {


   private final IAdministrativoRepository crudRepository;

   public AdministrativoRepository(IAdministrativoRepository crudRepository) {
      this.crudRepository = crudRepository;
   }

   public List<Administrativo> getAll(){
      return (List<Administrativo>) crudRepository.findAll();
   }

   public Optional<Administrativo> getOne(int idAdministrativo){
      return crudRepository.findById(idAdministrativo);
   }


   public Administrativo save(Administrativo administrativo){
      return crudRepository.save(administrativo);
   }

}
