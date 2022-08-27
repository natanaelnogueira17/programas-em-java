package poo;

public class Fusca {
	public static void main (String[] args) {
		Carro fusca = new Carro();
		fusca.ano = 1996;
		fusca.cor = "amarelo";
		System.out.println("Carro: Fusca ");
		System.out.println("Ano:  " + fusca.ano);
		System.out.println("Cor: "  + fusca.cor);
		fusca.ligar();
		fusca.acelerar();
		fusca.desligar();
		
		
		
	}

}
