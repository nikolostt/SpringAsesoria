package cl.darkos.SpringFinal.web.controller;

import cl.darkos.SpringFinal.model.domain.service.ProfesionalService;
import cl.darkos.SpringFinal.model.persistence.entity.Profesional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crearProfesional")
public class CrearProfesionalController {

    private final ProfesionalService service;

    public CrearProfesionalController(ProfesionalService service) {
        this.service = service;
    }

    @GetMapping
    public String crearProfesional(){
        return "crearProfesional";
    }

    @PostMapping("/guardarProfesional")
    public String save(@ModelAttribute Profesional profesional){
        service.save(profesional);
        return "redirect:/listarUsuarios";
    }
}
