package cl.darkos.SpringFinal.web.controller;

import cl.darkos.SpringFinal.model.domain.service.PagoService;
import cl.darkos.SpringFinal.model.persistence.entity.Pago;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crearPago")
public class CrearPagoController {

    private final PagoService service;

    public CrearPagoController(PagoService service) {
        this.service = service;
    }

    @GetMapping
    public String crearPago(){
        return "crearPago";
    }

    @PostMapping("/guardarPago")
    public String save(@ModelAttribute Pago pago){
        service.save(pago);
        return "redirect:/listadoPagos";
    }
}
