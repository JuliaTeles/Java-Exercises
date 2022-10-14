package com.example.Aula1.controller;

import com.example.Aula1.model.Aluno;
import com.example.Aula1.model.Professor;
import com.example.Aula1.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping (value="/apiProfessor")
public class ProfessorController {

    @Autowired
    ProfessorRepository prRepo;

    @GetMapping (value="/todos")
    public List<Professor> buscarTodos(){
        return prRepo.findAll();
    }

    @GetMapping (value="/professor/{codigo}")
    public Optional<Professor> buscarPorId(@PathVariable(value = "codigo")int codigo){
        return prRepo.findById(codigo);
    }

    @PostMapping(value = "/inserirProfessor")
    public void inserirProfessor(@RequestBody Professor pr){
        prRepo.save(pr);
    }

}