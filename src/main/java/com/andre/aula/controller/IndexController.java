package com.andre.aula.controller;

import com.andre.aula.entity.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getTexto(){
        return "REST funcionando..";
    }

//    @RequestMapping(value = "/{nome}", method = RequestMethod.GET)
//    public String getTexto(@PathVariable String nome){
//        return "Ola: " + nome;
//    }

    @RequestMapping(value = "/{nome}", method = RequestMethod.GET)
    public Usuario getTexto(@PathVariable String nome){
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        return usuario;
    }
}
