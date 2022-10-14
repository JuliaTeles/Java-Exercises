package com.example.Aula1.controller;


import com.example.Aula1.model.Aluno;
import com.example.Aula1.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping (value="/apiAluno")
public class AlunoController {

    @Autowired
    AlunoRepository alRepo;

    @GetMapping (value="/todos")
    public List<Aluno> buscarTodos(){

        return alRepo.findAll();
    }

    @GetMapping (value="/aluno/{ra}")
    public Optional<Aluno> buscarPorId(@PathVariable(value = "ra")int ra){
        return alRepo.findById(ra);
    }

    @PostMapping(value = "/inserirAluno")
    public void inserirAluno(@RequestBody Aluno al){
        alRepo.save(al);
    }
}
