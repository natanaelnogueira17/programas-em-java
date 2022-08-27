package poo;

public class Latam {

	public static void main(String[] args) {
		Aviao latam =  new Aviao();
		latam.ano = 2015;
		latam.cor = "branco";
		latam.envergadura = 11.2;
		System.out.println("Avião: Latam");
		System.out.println("Ano: " + latam.ano);
		System.out.println("Cor: " + latam.cor);
		System.out.println("Envergadura: " + latam.envergadura + "M");
		latam.ligar();
		latam.acelerar(); // chamou um metodo ja existem em Carro, porem alterado o comportamtneo em aviao;
	}

}
