package cl.darkos.SpringFinal.web.controller;

import cl.darkos.SpringFinal.model.domain.service.ContactoService;
import cl.darkos.SpringFinal.model.persistence.entity.Contacto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contacto")
public class ContactoController {

   private final ContactoService service;

   public ContactoController(ContactoService service) {
      this.service = service;
   }

   @GetMapping
   public String crearContacto(){
      return "contacto";
   }

   @PostMapping("/guardarContacto")
   public String save(@ModelAttribute Contacto contacto){
      service.save(contacto);
      return "redirect:/";
   }
}
