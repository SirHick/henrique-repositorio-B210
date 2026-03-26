package exesPolimorfismo;
import java.util.*;

public class AnimalMain {

	public static void main(String[] args) {
		
		Scanner aula = new Scanner (System.in);
		ArrayList<Animal> bicho = new ArrayList<>();
		int opcao;
		
		do {
			System.out.println("\n1. Adicionar Leão\r\n"
					+ "2. Adicionar Elefante\r\n"
					+ "3. Adicionar Papagaio\r\n"
					+ "4. Listar todos os animais\r\n"
					+ "5. Fazer todos os animais emitirem som\r\n"
					+ "6. Mostrar dieta de todos\r\n"
					+ "0. Sair");
			
			opcao = aula.nextInt();
			aula.nextLine();			
			
            switch (opcao) {
				case 1: 
					System.out.print("Nome do Leão: ");
					String nome = aula.nextLine();
					
					System.out.print("Idade do Leão: ");
					int idade = aula.nextInt();
					
					System.out.print("Peso do Leão: ");
					double peso = aula.nextDouble(); // Melhor usar nextDouble para peso
					
					Animal leao = new Leao(nome, idade, peso);
					
                    // Se quiser que mostre na hora de criar, precisa do System.out.println
					leao.emitirSom();
					System.out.println("Dieta: " + leao.getTipoAlimento()); 
					bicho.add(leao);
					break;
					
				case 2: 
					System.out.print("Nome do Elefante: ");
					nome = aula.nextLine();
					
					System.out.print("Idade do Elefante: ");
					idade = aula.nextInt();
					
					System.out.print("Peso do Elefante: ");
					peso = aula.nextDouble();
					
					System.out.print("Comprimento do Elefante: ");
					double comprimentoEle = aula.nextDouble();
					
					Animal elef = new Elefante(nome, idade, peso, comprimentoEle);
					
					elef.emitirSom();
					System.out.println("Dieta: " + elef.getTipoAlimento());
					bicho.add(elef);
					break;
				
				case 3:
					System.out.print("Nome do Papagaio: ");
					nome = aula.nextLine();
					
					System.out.print("Idade do Papagaio: ");
					idade = aula.nextInt();
					
					System.out.print("Peso do Papagaio: ");
					peso = aula.nextDouble();
					
                    // CORREÇÃO: Limpando o buffer do teclado (o 'Enter' que sobrou do peso)
					aula.nextLine(); 
					
					System.out.print("Cor das Penas: ");
					String corPenas = aula.nextLine();
					
					Animal papag = new Papagaio(nome, idade, peso, corPenas);
					
					papag.emitirSom();
					System.out.println("Dieta: " + papag.getTipoAlimento());
					bicho.add(papag);
					break;
					
				case 4: 
					System.out.println("\n --- Lista de Animais --- "); // Corrigido o título
            		if(bicho.isEmpty()) {
            			System.out.println("Nenhum animal cadastrado");
            		} else {
            			for(Animal a : bicho) {
            				a.exibirInfo();
            				System.out.println(" ----------------------");
            			}
            		}
            		break;
            		
				case 5:
					System.out.println("\n --- Sons dos Animais --- ");
                    if(bicho.isEmpty()) {
                        System.out.println("Nenhum animal cadastrado para emitir som.");
                    } else {
                        for(Animal a : bicho) {
                            a.emitirSom(); 
                        }
                    }
                    break;
                    
				case 6:
					System.out.println("\n --- Dieta dos Animais --- ");
                    if(bicho.isEmpty()) {
                        System.out.println("Nenhuma dieta cadastrada para exibir.");
                    } else {
                        for(Animal a : bicho) {
                            // CORREÇÃO: Usando System.out.println para imprimir o retorno do método
                            System.out.println(a.getTipoAlimento()); 
                        }
                    }
                    break;
                    
				case 0:
					System.out.println("Encerrando o sistema...");
					break;
					
				default:
					System.out.println("Valor inválido. Escolha um existente no menu.");
					break;
			}
			
		} while (opcao != 0);
		
		aula.close();
	}
}