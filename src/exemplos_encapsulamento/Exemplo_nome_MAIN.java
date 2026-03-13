package exemplos_encapsulamento;

import java.util.Scanner;

public class Exemplo_nome_MAIN{

    	public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            
            Exemplo_nome lista = new Exemplo_nome();

            int opcao;

            do {

                System.out.println("\n=== LISTA DE NOMES ===");
                System.out.println("1. Adicionar nome");
                System.out.println("2. Listar nomes");
                System.out.println("3. Remover nome");
                System.out.println("4. Buscar nome");
                System.out.println("0. Sair");
                System.out.print("Escolha: ");

                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {

                    case 1:
                        System.out.print("Nome: ");
                        String novoNome = scanner.nextLine();
                        lista.adicionarNome(novoNome);
                        break;

                    case 2:
                        lista.listarNomes();
                        break;

                    case 3:
                        System.out.print("Qual nome remover? ");
                        String remover = scanner.nextLine();
                        lista.removerNome(remover);
                        break;

                    case 4:
                        System.out.print("Nome: ");
                        String buscar = scanner.nextLine();
                        lista.buscarNome(buscar);
                        break;

                    case 0:
                        System.out.println("Saindo...");
                        break;

                    default:
                        System.out.println("❌ Opção inválida!");
                }

            } while (opcao != 0);

            scanner.close();
    }
}