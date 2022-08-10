package cl.darkos.SpringFinal.web.controller;

import cl.darkos.SpringFinal.model.domain.service.AdministrativoService;
import cl.darkos.SpringFinal.model.persistence.entity.Administrativo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/editarAdministrativo")
public class EditarAdministrativoController {

    private final AdministrativoService service;

    public EditarAdministrativoController(AdministrativoService service) {
        this.service = service;
    }

    @GetMapping("/editar/{idAdministrativo}")
    public String edit(@PathVariable("idAdministrativo") int idAdministrativo, Model model){
        model.addAttribute("administrativo",
                service.getOne(idAdministrativo)
                        .map(administrativo -> administrativo)
                        .orElse(null));
        return "editarAdministrativo";
    }

    @PostMapping("/guardarAdministrativo")
    public String guardarAdministrativo(@ModelAttribute Administrativo administrativo){
        service.save(administrativo);
        return "redirect:/listarUsuarios";
    }
}





