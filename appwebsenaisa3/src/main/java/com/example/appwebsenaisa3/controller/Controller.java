package com.example.appwebsenaisa3.controller;

import com.example.appwebsenaisa3.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Controller {

    @Autowired
    private ClienteRepository clienteRepository;
    private List<Cliente> clientes = new ArrayList<>();
    private int id = 0;

    public Cliente addCliente(String name, String endereco, String modalidade, Long matricula){
        Cliente cliente = new Cliente();
        id++;
        cliente.setId(id);
        cliente.setName(name);
        cliente.setEndereco(endereco);
        cliente.setModalidade(modalidade);
        cliente.setMatricula(matricula);
        clienteRepository.save(cliente);
        return cliente;
    }
    public Cliente findCliente(String name){
        List<Cliente> clientes = (List<Cliente>) clienteRepository.findAll();
        for(Cliente cliente : clientes){
            if(cliente.getName().equals(name)){
                return cliente;
            }
        }

        return null;
    }
    public void removeCliente(String name){
        Cliente cliente = findCliente(name);
        clienteRepository.delete(cliente);
    }

    public Cliente editCliente(String name, String endereco, String modalidade, Long matricula){
        Cliente cliente = findCliente(name);
        cliente.setEndereco(endereco);
        cliente.setModalidade(modalidade);
        cliente.setMatricula(matricula);
        clienteRepository.save(cliente);
        return cliente;
    }

    public List<Cliente> listAll(){
        return (List<Cliente>)clienteRepository.findAll();
    }
}