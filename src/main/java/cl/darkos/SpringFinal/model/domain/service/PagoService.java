package cl.darkos.SpringFinal.model.domain.service;


import cl.darkos.SpringFinal.model.persistence.entity.Pago;
import cl.darkos.SpringFinal.model.persistence.repository.PagoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagoService {

    private final PagoRepository repository;

    public PagoService(PagoRepository repository) {
        this.repository = repository;
    }

    public List<Pago> getAll(){
        return repository.getAll();
    }

    public Optional<Pago> getOne(int idPago){
        return repository.getOne(idPago);
    }

    public Pago save(Pago pago){
        return repository.save(pago);
    }
}
