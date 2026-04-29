package com.example.crud_spring2931.service;

import com.example.crud_spring2931.model.Pessoa;
import com.example.crud_spring2931.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class PessoaService {

    private final PessoaRepository repository;

    //read
    public List<Pessoa> listar(){
        return repository.findAll();
    }

}
