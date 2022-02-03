package br.com.eventoappcourse.eventoapp.controller;

import br.com.eventoappcourse.eventoapp.models.Convidados;
import br.com.eventoappcourse.eventoapp.repository.EventoRepository;
import br.com.eventoappcourse.eventoapp.models.Evento;
import br.com.eventoappcourse.eventoapp.repository.ConvidadosRepository;
import java.util.List;
import javax.validation.Valid;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@Log4j2
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

    //put the codigo
    @PostMapping("/{codigo}")
    public String addGuest(@PathVariable Long codigo, @Valid Convidados convidado, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("mensagem", "verifique os campos".toUpperCase());
            return "redirect:/{codigo}";
        }
        Evento evento = eventoRepository.findByCodigo(codigo);
        convidado.setEvento(evento);
        convidadoRepository.save(convidado);
        redirectAttributes.addFlashAttribute("mensagem", "Cadastrado com sucesso".toUpperCase());
        return "redirect:/{codigo}";
    }

    @RequestMapping("/deletarEvento")
    public String deleteEvent(long codigo, RedirectAttributes redirectAttributes) {
        Evento evento = eventoRepository.findByCodigo(codigo);
        List<Convidados> listaConvidados = (List<Convidados>) convidadoRepository.findByEvento(evento);
        if (!(listaConvidados.isEmpty())) {
            convidadoRepository.findByEvento(evento);
            convidadoRepository.deleteAll();
        } else {
            eventoRepository.delete(evento);
        }
        return "redirect:/eventos";
    }
    
    @RequestMapping("/deletarConvidado")
    public String deleteGuest(String rg) {
        Convidados convidado = convidadoRepository.findByRg(rg);
        Long codigo = convidado.getEvento().getCodigo();
        convidadoRepository.delete(convidado);
        return "redirect:/" + codigo.toString();
    }
}
