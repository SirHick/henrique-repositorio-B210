package com.example.crud_spring2931.service;

import com.example.crud_spring2931.model.Pessoa;
import com.example.crud_spring2931.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
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

    //read buscar por ID

    public Pessoa buscarPorID(Long id){
        return repository.findById(id)
                .orElseThrow(()-> new RuntimeException("Pessoa não encontrada"));
    }

    //create
    public Pessoa inserir(Pessoa pessoa){
        return repository.save(pessoa);
    }

    //update

    public Pessoa atualizar(Long id, Pessoa dados){
        Pessoa pessoa = buscarPorID(id);
        pessoa.setNome(dados.getNome());
        pessoa.setIdade(dados.getIdade());
        return repository.save(pessoa);
    }

    //delete

    public void remover(Long id){
        repository.deleteById(id);
    }

}
