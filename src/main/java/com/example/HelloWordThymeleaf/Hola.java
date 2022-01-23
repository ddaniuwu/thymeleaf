package com.example.HelloWordThymeleaf;


import com.example.HelloWordThymeleaf.domain.Persona;
import java.util.ArrayList;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class Hola {
    
    //Valor  desde el aplication.properties
    @Value("${index.saludo}")
    private String saludo;

    @GetMapping("/")
    public String inicio(Model model){
        
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        
        persona1.setNombre("Juan");
        persona1.setApellido("Perez");
        persona1.setEmail("5545454");
        persona1.setTelefono("454757");
        
        persona2.setNombre("Luis");
        persona2.setApellido("Gonzalez");
        persona2.setEmail("554545");
        persona2.setTelefono("443634");
        
        log.info("Ejecutando controlador desde MVC");
        log.info("Otro log mas");
        log.info("Agregamos otro log");
        
        var titulo ="INICIO";
        var mensaje = "HOLA DESDE EL CONTROLADOR";
        //model.addAttribute("mensaje",mensaje);
        //model.addAttribute("titulo",titulo);
        //model.addAttribute("saludo",saludo);
        
        //var personas = Arrays.asList(persona1 , persona2);
        var personas = new ArrayList();
        model.addAttribute("personas", personas);
        return "index";
       
    }
    
}
