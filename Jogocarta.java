package Array;

public class Jogocarta {

	public static void main(String[] args) {
		String[] nipes = { "ouros", "copas", "Espadas", "paus" };
		String [] faces = {"Az", "2", "3", "4","5","6","7","8","9","10","Valete","Dama","Rei"};
		//as linhas abaixo recuperarm de forma aleatoria o conteudo dos arrays
		
		String nipe = nipes[(int)(Math.random()*4)];
		String face = faces[(int)(Math.random()*faces.length)];
		// exibir a carta sorteada 
		System.out.println(face + " de " + nipe);

	}

}
