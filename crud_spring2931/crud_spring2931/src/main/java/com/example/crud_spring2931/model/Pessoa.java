package com.example.crud_spring2931.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pessoa")
@Data
@NoArgsConstructor //Construtor vazio
@AllArgsConstructor //Construtor com todos os argumentos

public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;
    //Lombok gera tudo (getters e setters das variáveis)
}