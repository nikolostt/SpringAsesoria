package cl.darkos.SpringFinal.model.persistence.repository;


import cl.darkos.SpringFinal.model.domain.repository.IPagoRepository;
import cl.darkos.SpringFinal.model.persistence.entity.Pago;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PagoRepository {

    private final IPagoRepository crudRepository;

    public PagoRepository(IPagoRepository crudRepository) {
        this.crudRepository = crudRepository;
    }

    public List<Pago> getAll(){
        return (List<Pago>) crudRepository.findAll();
    }

    public Optional<Pago> getOne(int idPago){
        return crudRepository.findById(idPago);
    }

    public Pago save(Pago pago){
        return crudRepository.save(pago);
    }
}
