package cl.darkos.SpringFinal.model.persistence.repository;


import cl.darkos.SpringFinal.model.domain.repository.ICapacitacionRepository;
import cl.darkos.SpringFinal.model.persistence.entity.Capacitacion;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CapacitacionRepository {


   private final ICapacitacionRepository crudRepository;

   public CapacitacionRepository(ICapacitacionRepository crudRepository) {
      this.crudRepository = crudRepository;
   }

   public List<Capacitacion> getAll(){
      return (List<Capacitacion>) crudRepository.findAll();
   }

   public Optional<Capacitacion> getOne(int idCapacitacion){
      return crudRepository.findById(idCapacitacion);
   }


   public Capacitacion save(Capacitacion capacitacion){
      return crudRepository.save(capacitacion);
   }
   /*
   public void delete(int idCapacitacion){
      crudRepository.deleteById(idCapacitacion);
   }
    */



}
