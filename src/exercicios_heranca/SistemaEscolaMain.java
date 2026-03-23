package exercicios_heranca;

import java.util.*;
import java.util.Scanner;

public class SistemaEscolaMain {

    public static void main(String[] args) {
        
        
        ArrayList<Pessoa> usuarios = new ArrayList<>();
        
        Scanner aula = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("\n--- MENU ESCOLA ---");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Professor");
            System.out.println("3 - Listar Todos");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            
            opcao = aula.nextInt();
            aula.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.println("\n-- CADASTRANDO ALUNO --");
                    System.out.print("Nome: ");
                    String nomeAluno = aula.nextLine();
                    
                    System.out.print("CPF: ");
                    String cpfAluno = aula.nextLine();
                    
                    System.out.print("Idade: ");
                    int idadeAluno = aula.nextInt();
                    
                    System.out.print("Matrícula: ");
                    int matricula = aula.nextInt();
                    aula.nextLine(); 
                    
                    System.out.print("Curso: ");
                    String curso = aula.nextLine();
                    
                    
                    usuarios.add(new Aluno(nomeAluno, cpfAluno, idadeAluno, matricula, curso));
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;
                    
                case 2:
                    System.out.println("\n-- CADASTRANDO PROFESSOR --");
                    System.out.print("Nome: ");
                    String nomeProf = aula.nextLine();
                    
                    System.out.print("CPF: ");
                    String cpfProf = aula.nextLine();
                    
                    System.out.print("Idade: ");
                    int idadeProf = aula.nextInt();
                    aula.nextLine(); 
                    
                    System.out.print("Disciplina: ");
                    String disciplina = aula.nextLine();
                    
                    System.out.print("Salário: ");
                    double salario = aula.nextDouble();
                    aula.nextLine(); 
                    
                    
                    usuarios.add(new Professor(nomeProf, cpfProf, idadeProf, disciplina, salario));
                    System.out.println("Professor cadastrado com sucesso!");
                    break;
                    
                case 3:
                    System.out.println("\n--- LISTA DE TODOS OS USUÁRIOS ---");
                    if (usuarios.isEmpty()) {
                        System.out.println("Nenhum usuário cadastrado no sistema.");
                    } else {
                        for (Pessoa p : usuarios) {
                            p.exibirDados(); 
                            System.out.println("-------------------------");
                        }
                    }
                    break;
                    
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                    
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
            
        } while (opcao != 0);
        
        aula.close();
    }
}