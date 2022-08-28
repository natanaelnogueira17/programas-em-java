package exercicios;

import java.util.Scanner;

public class JogoDado {

	public static void main(String[] args) {
		//entrada 
		char opcao = 's';
		Scanner teclado = new Scanner(System.in);
		while(opcao == 's') {
			System.out.println("lancamento do dado....***___***__--**");
			int dado = (int)(Math.random()*6 + 1);
			System.out.println("Face: " + dado);
			System.out.println("Deseja lancar o dado novamente(s/n)? ");
			opcao = teclado.next().charAt(0);
		};

	}

}
