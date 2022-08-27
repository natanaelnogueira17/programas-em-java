package exercicios;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		// IMC = peso/(altura*altura)
		double peso, altura, IMC;
		
		//objeto
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		
		System.out.print("Digite seu peso em kg : ");
		peso = teclado.nextDouble();
		System.out.print("Digite sua altura em M: ");
		altura = teclado.nextDouble();
		
		//processamento
		
		IMC = peso/(altura*altura);
		
		if(IMC< 18.5) {
			System.out.println("Você esta muito abaixo do peso ");
		}else if(IMC > 18.5 && IMC <25 ) {
			System.out.println("Peso ideal");
			
		}else if(IMC > 24.9 && IMC <35) {
			System.out.println("obesidade grau I");
		} else if(IMC >34.99 && IMC < 40) {
			System.out.println("obesidade grau II (severa)");
		}else if(IMC> 39.9) {
			System.out.println("obesidade III (morbida)");
		}
		teclado.close();
	}

}
