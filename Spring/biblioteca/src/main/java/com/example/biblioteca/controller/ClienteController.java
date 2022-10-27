package com.example.biblioteca.controller;

import com.example.biblioteca.model.Cliente;
import com.example.biblioteca.model.Livro;
import com.example.biblioteca.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/apiCliente")
public class ClienteController {

    @Autowired
    ClienteRepository clienteRepository;

    @GetMapping(value="/cliente")
    public List<Cliente> buscarTodos(){
        return clienteRepository.findAll();
    }

    @GetMapping (value="/cliente/{cpf}")
    public Optional<Cliente> buscarPorId(@PathVariable(value = "cpf")int cpf){
        return clienteRepository.findById(cpf);
    }

    @PostMapping(value = "/cliente")
    public void inserir(@RequestBody Cliente cliente){
        clienteRepository.save(cliente);
    }
}