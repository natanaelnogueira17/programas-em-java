package exercicios;


import java.util.Scanner;

public class PDV {

	public static void main(String[] args) {
		//variaveis
		double valorTotal;
		double desconto;
		double valorFinal;
		double pagamento;
		double troco;
		
		Scanner teclado = new Scanner(System.in);
	
		// entradas e procesamento
		System.out.print(" total de produtos R$  ");
		valorTotal = teclado.nextDouble();
	
		System.out.print("desconto em %: ");
		desconto = teclado.nextDouble() / 100;
		valorFinal = valorTotal - (valorTotal*desconto);
		
		System.out.println("O valor final é : " + valorFinal);
		
		System.out.println("valor pago R$: ");
		pagamento = teclado.nextDouble();
		troco = pagamento - valorFinal;
		System.out.println("troco R$: " + troco);
		System.out.println("Obrigado e volte sempre!");
		teclado.close();
		
	}

}
