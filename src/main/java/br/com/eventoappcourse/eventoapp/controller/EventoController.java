package br.com.eventoappcourse.eventoapp.controller;

import br.com.eventoappcourse.eventoapp.models.Convidados;
import br.com.eventoappcourse.eventoapp.repository.EventoRepository;
import br.com.eventoappcourse.eventoapp.models.Evento;
import br.com.eventoappcourse.eventoapp.repository.ConvidadosRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EventoController {
    
    @Autowired
    private EventoRepository eventoRepository;
    
    @Autowired
    private ConvidadosRepository convidadoRepository;
    
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
    
    @GetMapping("/{codigo}")
    public ModelAndView eventoDetails(@PathVariable Long codigo) {
        Evento evento = eventoRepository.findByCodigo(codigo);
        ModelAndView modelAndView = new ModelAndView("evento/detalhesEvento");
        modelAndView.addObject("detalhesEvento", evento);
        
        Iterable<Convidados> convidados = convidadoRepository.findByEvento(evento);
        modelAndView.addObject("listaConvidados", convidados);
        
        return modelAndView;
    }
    
    @PostMapping("/{codigo}")
    public String addGuest(@PathVariable Long codigo, @Valid Convidados convidado, BindingResult bindingResult) {
        Evento evento = eventoRepository.findByCodigo(codigo);
        convidado.setEvento(evento);
        convidadoRepository.save(convidado);
        return "redirect:/{codigo}";
    }
}
