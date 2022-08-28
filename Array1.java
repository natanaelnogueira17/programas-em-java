package Array;

import java.util.Iterator;

public class Array1 {

	public static void main(String[] args) {
		String[] carros = { "ferrari", "camaro", "fusca", "uno" };
		// indice do array [0] [1] [2] [3]
		System.out.println("Tamanho do array: " + carros.length);

		System.out.println("carro: " + carros[2]);
		carros[2] = "poshe";
		System.out.println("carro: " + carros[2]);
		System.out.println("_______________________________" );
		
		for(int i = 0; i < carros.length;i++) {
			System.out.println(carros[i]);
		}
		
		
	}

}
