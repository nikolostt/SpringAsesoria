package cl.darkos.SpringFinal.model.persistence.repository;


import cl.darkos.SpringFinal.model.domain.repository.IProfesionalRepository;
import cl.darkos.SpringFinal.model.persistence.entity.Profesional;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProfesionalRepository {


   private final IProfesionalRepository crudRepository;

   public ProfesionalRepository(IProfesionalRepository crudRepository) {
      this.crudRepository = crudRepository;
   }

   public List<Profesional> getAll(){
      return (List<Profesional>) crudRepository.findAll();
   }

   public Optional<Profesional> getOne(int idProfesional){
      return crudRepository.findById(idProfesional);
   }


   public Profesional save(Profesional profesional){
      return crudRepository.save(profesional);
   }


}
