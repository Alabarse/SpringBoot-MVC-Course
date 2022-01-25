package br.com.eventoappcourse.eventoapp.controller;

import br.com.eventoappcourse.eventoapp.repository.EventoRepository;
import br.com.eventoappcourse.eventoapp.models.Evento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EventoController {
    
    @Autowired
    private EventoRepository eventoRepository;
    
    @GetMapping("/cadastrarEvento")
    public String form() {
        return "evento/formEvento";
    }
    
    @PostMapping("/cadastrarEvento")
    public String saveForm(Evento evento) {
        
        eventoRepository.save(evento);
        return "redirect:/cadastrarEvento";
    }
    
    @GetMapping("/eventos")
    public ModelAndView listAll() {
        ModelAndView modelAndView = new ModelAndView("listaEventos");
        Iterable<Evento> eventos = eventoRepository.findAll();
        modelAndView.addObject("eventos", eventos);
        return modelAndView;
    }
}
