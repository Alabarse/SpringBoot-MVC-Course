package br.com.eventoappcourse.eventoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    
    //@RequestMapping(value = "/" METHOD.GET)
    @GetMapping("/")
    public String homePage() {
        return "index";
    }
}
