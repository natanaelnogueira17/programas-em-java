package poo;

public class Uno {
	public static void main (String[] args) {
		Carro uno = new Carro (2000, "azul");
		
		System.out.println("Carro: Uno ");
		System.out.println("Ano:  " + uno.ano);
		System.out.println("Cor: "  + uno.cor);
		uno.ligar();
		uno.acelerar();
		uno.desligar();
		
	}

}
