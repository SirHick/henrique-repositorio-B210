package exemplosPolimorfismo;
import java.util.*;
public class PagamentoMain {

	public static void main(String[] args) {
		
		Scanner aula = new Scanner (System.in);
		
		ArrayList <Pagamento> pagamentos = new ArrayList<>();
		
		int opcao;
		
		do {
			
			System.out.println(" == MENU PRINCIPAL == ");
			System.out.println("1. Pagar com Cartão de Crédito ");
			System.out.println("2. Pagar com PIX ");
			System.out.println("3. Pagar com Boleto ");
			System.out.println("4. Listar todos os pagamentos ");
			System.out.println("5. Calcular o total de taxas ");
			System.out.println("0. SAIR ");
			
			System.out.println("Escolha uma opcao: ");
			
			opcao = aula.nextInt();
			aula.nextLine();
			
			switch(opcao) {
			case 1:
				System.out.println("Pagamento com cartão");
				System.out.println("Titular: ");
				String titularCartao = aula.nextLine();
				
				System.out.println("Valor: ");
				double valorCartao = aula.nextDouble();
				aula.nextLine();//buffer
				
				System.out.println("Número do cartão (16 dígitos): ");
				String numeroCartao = aula.nextLine();
				
				//Polimorfismo: Tipo Pagamento, Objeto CartaoCredito
				Pagamento pagCartao = new CartaoCredito(titularCartao, valorCartao, numeroCartao);
				//Antes do Polimorfismo: Pagamento pagCart = new Pagamento(titularCartao, valorCartao, numeroCartao)
				pagCartao.processarPagamento();
				//ArrayList
				pagamentos.add(pagCartao);
				
				break;
				
			case 2: 
				System.out.println("Pagamento com PIX");
				System.out.println("Titular: ");
				String nomePIX = aula.nextLine();
				
				System.out.println("Valor: ");
				double valorPIX = aula.nextDouble();
				aula.nextLine();
				
				System.out.println("Chave Pix: ");
				String chavePIX = aula.nextLine();
				
				Pagamento pagPIX = new Pix(nomePIX, valorPIX, chavePIX);
				pagPIX.processarPagamento();
				pagamentos.add(pagPIX);
				
				break;
				
			case 3:
				System.out.println("Pagamento com Boleto");
				System.out.println("Titular: ");
				String nomeBoleto = aula.nextLine();
				
				System.out.println("Valor: ");
				double valorBoleto = aula.nextDouble();
				aula.nextLine();
				
				System.out.println("Código de Barras: ");
				String codigoBarras = aula.nextLine();
				
				Pagamento pagBoleto = new Boleto(nomeBoleto, valorBoleto, codigoBarras);
				pagBoleto.processarPagamento();
				pagamentos.add(pagBoleto);
				
				break;
				
			case 4:
				System.out.println("\n === TODOS OS PAGAMENTOS === ");
				if (pagamentos.isEmpty()) {
					System.out.println("Nenhum pagamento registrado até o momento.");
				} else {
					for(Pagamento pags : pagamentos) {
						System.out.println(pags); 
					}
				}
				break;
				
			case 5:
				System.out.println("\n === TOTAL DE TAXAS === ");
				double totalTaxas = 0.0;
				
				for(Pagamento pags : pagamentos) {
					// Polimorfismo em ação: cada objeto calcula sua própria taxa
					totalTaxas += pags.calcularTaxa(); 
				}
				
				System.out.printf("O valor total de taxas geradas é: R$ %.2f\n", totalTaxas);
				break;
				
			case 0:
				System.out.println("\nEncerrando o sistema de pagamentos");
				break;
				
			default: 
				System.out.println("\nOpção inválida. Por favor, escolha uma opção do menu.");
				break;
			
			}
			
			System.out.println(); // Pula uma linha para deixar o menu mais limpo no console
			
		} while(opcao != 0);
	
		aula.close();
	}

}