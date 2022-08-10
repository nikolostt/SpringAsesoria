package cl.darkos.SpringFinal.model.domain.service;

import cl.darkos.SpringFinal.model.persistence.entity.Visita;
import cl.darkos.SpringFinal.model.persistence.repository.VisitaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VisitaService {

    private final VisitaRepository repository;

    public VisitaService(VisitaRepository repository) {
        this.repository = repository;
    }

    public List<Visita> getAll(){
        return repository.getAll();
    }

    public Optional<Visita> getOne(int idVisita){
        return repository.getOne(idVisita);
    }


    public Visita save(Visita visita){
        return repository.save(visita);
    }
}
