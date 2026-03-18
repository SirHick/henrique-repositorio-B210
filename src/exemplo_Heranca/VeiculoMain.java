package exemplo_Heranca;
import java.util.*;
public class VeiculoMain {

	public static void main(String[] args) {
		
		Scanner aula = new Scanner (System.in);
		
		System.out.println(" == CADASTRO  DE VEICULO == ");
		System.out.println("Marca: ");
		String marca = aula.nextLine();
		
		System.out.println("Modelo: ");
		String modelo = aula.nextLine();
		
		System.out.println("Ano: ");
		int ano = aula.nextInt();
		
		System.out.println("Quantidade de Portas: ");
		int portas = aula.nextInt();
		aula.nextLine();//buffer
		
		//TRANSFORMANDO CLASSE EM OBJETO
		
		Carro car = new Carro(marca, modelo, ano, portas);
		
		System.out.println("== Cadastro de MOTO == ");
		System.out.println("Marca: ");
		marca = aula.nextLine();
		
		System.out.println("Modelo: ");
		modelo = aula.nextLine();
		
		System.out.println("Ano: ");
		ano = aula.nextInt();
		
		System.out.println("Cilindradas: ");
		int cilindradas = aula.nextInt();
		
		Moto biz = new Moto(marca, modelo, ano, cilindradas);
		
		System.out.println("\n");
		car.exibirDados();
		System.out.println("\n");
		biz.exibirDados();
		
		aula.close();
	}
	

}
