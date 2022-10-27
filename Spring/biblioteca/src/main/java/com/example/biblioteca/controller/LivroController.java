package com.example.biblioteca.controller;

import com.example.biblioteca.model.Livro;
import com.example.biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/apiLivro")
public class LivroController {

    @Autowired
    LivroRepository livroRepository;

    @GetMapping(value="/livro")
    public List<Livro> buscarTodos(){
        return livroRepository.findAll();
    }

    @GetMapping (value="/livro/{codigo}")
    public Optional<Livro> buscarPorId(@PathVariable(value = "codigo")int codigo){
        return livroRepository.findById(codigo);
    }

    @PostMapping(value = "/livro")
    public void inserir(@RequestBody Livro livro){
        livroRepository.save(livro);
    }
}
