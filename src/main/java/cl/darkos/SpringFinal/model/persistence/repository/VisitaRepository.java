package cl.darkos.SpringFinal.model.persistence.repository;


import cl.darkos.SpringFinal.model.domain.repository.IVisitaRepository;
import cl.darkos.SpringFinal.model.persistence.entity.Visita;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class VisitaRepository {

    private final IVisitaRepository crudRepository;

    public VisitaRepository(IVisitaRepository crudRepository) {
        this.crudRepository = crudRepository;
    }

    public List<Visita> getAll(){
        return (List<Visita>) crudRepository.findAll();
    }

    public Optional<Visita> getOne(int idVisita){
        return crudRepository.findById(idVisita);
    }


    public Visita save(Visita visita){
        return crudRepository.save(visita);
    }
}
