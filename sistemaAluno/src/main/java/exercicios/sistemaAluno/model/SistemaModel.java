package exercicios.sistemaAluno.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "aluno")
@Data
@NoArgsConstructor //Construtor vazio
@AllArgsConstructor //Construtor com todos os argumentos

public class SistemaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String curso;
    private String matricula;
    //Lombok gera tudo (getters e setters das variáveis)

}
