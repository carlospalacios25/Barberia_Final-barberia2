package com.barberia.barberia.controlador;

import com.barberia.barberia.interfacesServicios.IServicesUsuario;
import com.barberia.barberia.modelo.usuario;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ControladorUsuario {

    @Autowired
    private IServicesUsuario services;

    @GetMapping("/nuevousuario")
    public String agregar(Model model){
        model.addAttribute("usuario",new usuario());
        return "usuario";
    }
    @PostMapping("/guardarusuario")
    public String guardar(@Valid usuario usuario, Model model){
        services.save(usuario);
        return "redirect:/cortes";//menu
    }
}
