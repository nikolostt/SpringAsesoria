package cl.darkos.SpringFinal.web.controller;

import cl.darkos.SpringFinal.model.domain.service.AdministrativoService;
import cl.darkos.SpringFinal.model.persistence.entity.Administrativo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crearAdministrativo")
public class CrearAdministrativoController {

    private final AdministrativoService service;

    public CrearAdministrativoController(AdministrativoService service) {
        this.service = service;
    }

    @GetMapping
    public String crearAdministrativo(){
        return "crearAdministrativo";
    }

    @PostMapping("/guardarAdministrativo")
    public String save(@ModelAttribute Administrativo administrativo){
        service.save(administrativo);
        return "redirect:/listarUsuarios";
    }
}
