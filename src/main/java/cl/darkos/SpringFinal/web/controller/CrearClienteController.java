package cl.darkos.SpringFinal.web.controller;

import cl.darkos.SpringFinal.model.domain.service.ClienteService;
import cl.darkos.SpringFinal.model.persistence.entity.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crearCliente")
public class CrearClienteController {

    private final ClienteService service;

    public CrearClienteController(ClienteService service) {
        this.service = service;
    }

    @GetMapping
    public String crearCliente(){
        return "crearCliente";
    }

    @PostMapping("/guardarCliente")
    public String save(@ModelAttribute Cliente cliente){
        service.save(cliente);
        return "redirect:/listarUsuarios";
    }
}
