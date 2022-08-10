package cl.darkos.SpringFinal.web.controller;


import cl.darkos.SpringFinal.model.domain.service.PagoService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/listadoPagos")
public class ListadoPagosController {

    Log logger = LogFactory.getLog(CapacitacionController.class);
    private final PagoService service;

    public ListadoPagosController(PagoService service) {
        this.service = service;
    }

    @GetMapping
    public String getPagos(Model model) {
        System.out.println(service.getAll().size());
        model.addAttribute("pagos", service.getAll());
        return "listadoPagos";
    }
}
