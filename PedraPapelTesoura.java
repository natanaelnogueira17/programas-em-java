package exercicios;

import java.util.Scanner;

public class PedraPapelTesoura {

	public static void main(String[] args) {
		// variaveis
		int jogador;
		int computador;
		Scanner teclado = new Scanner(System.in);
		System.out.println("_____Jokenpô_______");
		System.out.println("");
		System.out.println("1.Pedra");
		System.out.println("2.Papel");
		System.out.println("3.Tesoura ");
		System.out.println("");
		System.out.print("Digite a opção desejada:  ");
		// logica do jogo
		jogador = teclado.nextInt();
		System.out.println("");
		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu Pedra");
			break;
		case 2:
			System.out.println("O jogador escolheu Papel");
			break;
		case 3:
			System.out.println("Jogador escolheu Tesoura ");
			break;
		default:
			System.out.println("opção invalida ");
		}

		// logica do computador
		computador = (int) (Math.random() * 3 + 1);
		switch (computador) {
		case 1:
			System.out.println("Computador escolheu Pedra");
			break;
		case 2:
			System.out.println("Computador escolheu Papel");
			break;
		case 3:
			System.out.println("Computador escolheu Tesoura ");
			break;

		}

		// logica do vencedor

		System.out.println("");
		if (jogador == computador) {
			System.out.println("Empate");
		} else {
			if (jogador == 1 && computador == 2) {
				System.out.println("O computador venceu");
			} else {
				if (jogador == 1 && computador == 3) {
					System.out.println("O Jogador venceu");
				} else {
					if (jogador == 2 && computador == 1) {
						System.out.println("O Jogador venceu");
					} else {
						if (jogador == 2 && computador == 3) {
							System.out.println("O computador venceu");
						} else {
							if (jogador == 3 && computador == 1) {
								System.out.println("O computador venceu");
							} else {
								if (jogador == 3 && computador == 2) {
									System.out.println("O jogador venceu");
								}
							}
						}
					}
				}
			}
		}

		teclado.close();
	}
}
