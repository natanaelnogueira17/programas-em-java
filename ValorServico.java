package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValorServico {

	public static void main(String[] args) {
		//variaveis 
		double hora;
		double remuneracao;
		double custo;
		double cargaHoraria;
		//objetos
		
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		//entrada
		System.out.println("calculo do valor de um servico");
		System.out.print("remuneracao mensal pretendida");
		remuneracao = teclado.nextDouble();
		
		System.out.print("Custo operacional");
		custo = teclado.nextDouble();
		
		System.out.print("Carga horaria de trabalho");
		cargaHoraria = teclado.nextDouble();
		
		// processamento
		hora = (remuneracao + (remuneracao*0.3)+ custo + (remuneracao*0.2))/cargaHoraria;
		//saida
		System.out.println("valor da hora: " + formatador.format(hora));
		teclado.close();
		
		
	}

}
