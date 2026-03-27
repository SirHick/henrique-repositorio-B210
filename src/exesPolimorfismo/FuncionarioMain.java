package exesPolimorfismo;
import java.util.*;
public class FuncionarioMain {
	
public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        ArrayList<Funcionario> funcionarios = new ArrayList<>();
	        int opcao = -1;

	        do {
	            System.out.println("\n--- SISTEMA DE FUNCIONÁRIOS ---");
	            System.out.println("1. Cadastrar Gerente");
	            System.out.println("2. Cadastrar Vendedor");
	            System.out.println("3. Cadastrar Programador");
	            System.out.println("4. Listar todos os contracheques");
	            System.out.println("5. Calcular folha de pagamento total");
	            System.out.println("6. Buscar funcionário por nome");
	            System.out.println("0. Sair");
	            System.out.print("Escolha uma opção: ");
	            
	            opcao = sc.nextInt();
	            sc.nextLine(); 

	            switch (opcao) {
	                case 1:
	                    System.out.print("Nome do Gerente: ");
	                    String nomeGerente = sc.nextLine();
	                    System.out.print("Salário Base: R$ ");
	                    double salarioGerente = sc.nextDouble();
	                    System.out.print("Bônus Fixo: R$ ");
	                    double bonus = sc.nextDouble();
	                    
	                    funcionarios.add(new Gerente(nomeGerente, salarioGerente, bonus));
	                    System.out.println("Gerente cadastrado com sucesso!");
	                    break;

	                case 2:
	                    System.out.print("Nome do Vendedor: ");
	                    String nomeVendedor = sc.nextLine();
	                    System.out.print("Salário Base: R$ ");
	                    double salarioVendedor = sc.nextDouble();
	                    System.out.print("Total de Vendas: R$ ");
	                    double vendas = sc.nextDouble();
	                    System.out.print("Porcentagem de Comissão (ex: 5 para 5%): ");
	                    double comissao = sc.nextDouble();
	                    
	                    funcionarios.add(new Vendedor(nomeVendedor, salarioVendedor, vendas, comissao));
	                    System.out.println("Vendedor cadastrado com sucesso!");
	                    break;

	                case 3:
	                    System.out.print("Nome do Programador: ");
	                    String nomeProg = sc.nextLine();
	                    System.out.print("Salário Base: R$ ");
	                    double salarioProg = sc.nextDouble();
	                    System.out.print("Horas Extras trabalhadas: ");
	                    int horas = sc.nextInt();
	                    System.out.print("Valor por Hora Extra: R$ ");
	                    double valorHora = sc.nextDouble();
	                    
	                    funcionarios.add(new Programador(nomeProg, salarioProg, horas, valorHora));
	                    System.out.println("Programador cadastrado com sucesso!");
	                    break;

	                case 4:
	                    System.out.println("\n--- LISTA DE CONTRACHEQUES ---");
	                    if (funcionarios.isEmpty()) {
	                        System.out.println("Nenhum funcionário cadastrado.");
	                    } else {
	                        
	                        for (Funcionario f : funcionarios) {
	                            f.exibirContracheque();
	                        }
	                    }
	                    break;

	                case 5:
	                    double folhaTotal = 0;
	                    for (Funcionario f : funcionarios) {
	                        folhaTotal += f.calcularSalario();
	                    }
	                    System.out.printf("\n💰 FOLHA DE PAGAMENTO TOTAL: R$ %.2f\n", folhaTotal);
	                    break;

	                case 6:
	                    System.out.print("Digite o nome exato do funcionário para buscar: ");
	                    String busca = sc.nextLine();
	                    boolean encontrado = false;
	                    
	                    for (Funcionario f : funcionarios) {
	                        if (f.getNome().equalsIgnoreCase(busca)) {
	                            System.out.println("\nFuncionário encontrado!");
	                            f.exibirContracheque();
	                            encontrado = true;
	                            break;
	                        }
	                    }
	                    if (!encontrado) {
	                        System.out.println("Funcionário '" + busca + "' não localizado.");
	                    }
	                    break;

	                case 0:
	                    System.out.println("Encerrando o sistema...");
	                    break;

	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }
	        } while (opcao != 0);

	        sc.close();
	    }
	}