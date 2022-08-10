package cl.darkos.SpringFinal.web.controller;

import cl.darkos.SpringFinal.model.domain.service.ClienteService;
import cl.darkos.SpringFinal.model.persistence.entity.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/editarCliente")
public class EditarClienteController {

    private final ClienteService service;

    public EditarClienteController(ClienteService service) {
        this.service = service;
    }

    @GetMapping("/editar/{idCliente}")
    public String edit(@PathVariable("idCliente") int idCliente, Model model){
        model.addAttribute("cliente",
                service.getOne(idCliente)
                        .map(cliente -> cliente)
                        .orElse(null));
        return "editarCliente";
    }

    @PostMapping("/guardarCliente")
    public String guardarCliente(@ModelAttribute Cliente cliente){
        service.save(cliente);
        return "redirect:/listarUsuarios";
    }
}
