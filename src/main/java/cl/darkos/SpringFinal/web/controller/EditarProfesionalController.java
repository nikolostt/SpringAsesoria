package cl.darkos.SpringFinal.web.controller;

import cl.darkos.SpringFinal.model.domain.service.ProfesionalService;
import cl.darkos.SpringFinal.model.persistence.entity.Profesional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/editarProfesional")
public class EditarProfesionalController {

    private final ProfesionalService service;

    public EditarProfesionalController(ProfesionalService service) {
        this.service = service;
    }

    @GetMapping("/editar/{idProfesional}")
    public String edit(@PathVariable("idProfesional") int idProfesional, Model model){
        model.addAttribute("profesional",
                service.getOne(idProfesional)
                        .map(profesional -> profesional)
                        .orElse(null));
        return "editarProfesional";
    }

    @PostMapping("/guardarProfesional")
    public String guardarProfesional(@ModelAttribute Profesional profesional){
        service.save(profesional);
        return "redirect:/listarUsuarios";
    }

}
