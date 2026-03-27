package exesPolimorfismo;
import java.util.*;
public class TransporteMain {

	public static void main(String[] args) {
		
		Scanner aula = new Scanner (System.in);
		
		ArrayList<Transporte> transp = new ArrayList<>();
		
		int opcao;
		
		do {
            System.out.println("\n--- MENU CADASTRO DE VEÍCULO ---");
            System.out.println("1 - Cadastrar Carro");
            System.out.println("2 - Cadastrar Ônibus");
            System.out.println("3 - Cadastrar Bicicleta");
            System.out.println("4 - Listar Todos os Transportes");
            System.out.println("5 - Calcular custo total dos veículos");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            
            opcao = aula.nextInt();
            aula.nextLine();
            
            switch(opcao) {
            	case 1: 
            	System.out.println("== Cadastro CARRO ==");
            	System.out.println("Digite a distância percorrida (km): ");
            	double distancia = aula.nextDouble();
            	
            	System.out.println("Digite a Quantidade de passageiros: ");
            	int qtdPassageiros = aula.nextInt();
            	aula.nextLine();
            	System.out.println("Digite o tipo do combustível: ");
            	String tipoComb = aula.nextLine();
            	
            	Transporte car = new Carro(distancia, qtdPassageiros, tipoComb);
            	car.calcularCusto();
            	transp.add(car);
            	break;
            	
            	case 2:
            		System.out.println("== Cadastro Ônibus ==");
                	System.out.println("Digite a distância percorrida (km): ");
                	distancia = aula.nextDouble();
                	
                	System.out.println("Digite a Quantidade de passageiros: ");
                	qtdPassageiros = aula.nextInt();
                	
                	System.out.println("Digite o número de Linhas: ");
                	int numLinhas = aula.nextInt();
                	
                	Transporte bus = new Onibus(distancia, qtdPassageiros, numLinhas);
                	bus.calcularCusto();
                	transp.add(bus); 
                	break;
                	
            	case 3:
            		System.out.println("== Cadastro Bicicleta ==");
                	System.out.println("Digite a distância percorrida (km): ");
                	distancia = aula.nextDouble();
                	
                	System.out.println("Digite a Quantidade de passageiros: ");
                	qtdPassageiros = aula.nextInt();
                	
                	System.out.println("Digite o tipo do Freio: ");
                	String tipoFreio = aula.nextLine();
                	aula.nextLine();
                	
                	Transporte bike = new Bicicleta(distancia, qtdPassageiros, tipoFreio);
                	bike.calcularCusto();
                	transp.add(bike);
                	break;
                	
            	case 4: 
            		System.out.println("\n --- Lista de Transportes --- ");
            		if(transp.isEmpty()) {
            			System.out.println("Nenhum Cadastro de transporte");
            		}else {
            			for(Transporte t : transp) {
            				t.exibirDetalhes();
            				System.out.println(" ----------------------");
            			}
            		}
            		break;
            		 
            	case 5:
    				System.out.println("\n === TOTAL DE CUSTO === ");
    				double totalCusto = 0.0;
    				
    				for(Transporte tr : transp) {
    					
    					totalCusto += tr.calcularCusto(); 
    				}
    				
    				System.out.printf("O valor total de Custo gerado é: R$ %.2f\n", totalCusto);
    				break;
    				
    			case 0:
    				System.out.println("\nEncerrando o sistema de cadastro de Transportes.");
    				break;
    				
    			default: 
    				System.out.println("\nOpção inválida. Por favor, escolha uma opção do menu.");
    				break;
            }
            
		}while(opcao != 0);
		
		aula.close();
	}

}