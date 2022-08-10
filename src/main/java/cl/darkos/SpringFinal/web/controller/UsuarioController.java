package cl.darkos.SpringFinal.web.controller;

import cl.darkos.SpringFinal.model.domain.service.AdministrativoService;
import cl.darkos.SpringFinal.model.domain.service.ClienteService;
import cl.darkos.SpringFinal.model.domain.service.ProfesionalService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/listarUsuarios")
public class UsuarioController {

   Log logger = LogFactory.getLog(UsuarioController.class);
   private final AdministrativoService service;
   private final ClienteService service1;
   private final ProfesionalService service2;

   public UsuarioController(AdministrativoService service, ClienteService service1, ProfesionalService service2) {
      this.service = service;
      this.service1 = service1;
      this.service2 = service2;
   }

   @GetMapping
   public String getUsuarios(Model model){
      System.out.println(service.getAll().size());
      model.addAttribute("administrativos", service.getAll());
      model.addAttribute("clientes", service1.getAll());
      model.addAttribute("profesionales", service2.getAll());
      return "listarUsuarios";
   }
}
