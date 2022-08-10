package cl.darkos.SpringFinal.web.controller;

import cl.darkos.SpringFinal.model.domain.service.VisitaService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/listadoVisitas")
public class ListadoVisitasController {

    Log logger = LogFactory.getLog(CapacitacionController.class);
    private final VisitaService service;

    public ListadoVisitasController(VisitaService service) {
        this.service = service;
    }
    @GetMapping
    public String getVisitas(Model model){
        System.out.println(service.getAll().size());
        model.addAttribute("visitas", service.getAll());
        return "listadoVisitas";
    }
}
