package com.example.appwebsenaisa3.view;

import com.example.appwebsenaisa3.controller.Controller;
import com.example.appwebsenaisa3.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ClienteView {

    @Autowired
    Controller controller;
    @GetMapping("/cliente")
    public Cliente findCliente(@PathParam("name") String name){
        return controller.findCliente(name);
    }

    @DeleteMapping("/cliente")
    public String deleteCliente(@PathParam("name") String name){
        Cliente cliente = new Cliente();
        return "Cliente com o nome de " + name + " foi deletada";
    }

    @PostMapping("/cliente")
    public Cliente addCliente(@PathParam("name") String name, @PathParam("endereco") String endereco,
    @PathParam("modalidade") String modalidade, @PathParam("long") long matricula){
        return controller.addCliente(name, endereco, modalidade, matricula);
    }

    @PutMapping("/cliente")
    public Cliente updateCliente(@PathParam("name") String name, @PathParam("endereco") String endereco,
    @PathParam("modalidade") String modalidade, @PathParam("long") long matricula){
        controller.editCliente(name, endereco, modalidade, matricula);
        return controller.editCliente(name, endereco, modalidade, matricula);
    }

    @GetMapping("/all")
    public List<Cliente> listAll(){
        return controller.listAll();

    }

}