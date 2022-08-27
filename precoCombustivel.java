package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class precoCombustivel {

	public static void main(String[] args) {
		// variavel
		double etanol;
		double gasolina;
		
		// objeto
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		// processamento 
		System.out.print("digite o preco do etanol:  ");
		etanol = teclado.nextDouble();
		System.out.print("digite o preco da gasolina:   ");
		gasolina = teclado.nextDouble();
		
		
		if(etanol <= gasolina - (gasolina *0.35) ) {
			System.out.println("Etanol é o combustivel mais vantajoso");
		}else {
			System.out.println("gasolina é mais vantajoso");
		}
		
		teclado.close();
	}

}
