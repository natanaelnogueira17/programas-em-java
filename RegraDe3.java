package exercicios;


import java.util.Scanner;

public class RegraDe3 {

	public static void main(String[] args) {
		//variaveis
		double x;
		double y;
		double valor ;
		
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.println("regra de 3   ---> x % de y = valor");
		System.out.print("digite o valor de x: ");
		x = teclado.nextDouble();
		System.out.print("digite o valor de y :  ");
		y = teclado.nextDouble();
		//processamento
		valor = (x/100)*y;
		// saida
		System.out.println("o valor é igual a : " + valor );
		
		
		
		
		teclado.close();
			
		
	}

}
