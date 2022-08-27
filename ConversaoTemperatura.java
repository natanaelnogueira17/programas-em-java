package exercicios;
import java.text.DecimalFormat;
import java.util.Scanner;
public class ConversaoTemperatura {

	public static void main(String[] args) {
		//variaveis 
		double f;
		double c;
		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");
		//entrada
		System.out.println("Conversao de temperaturas ");
		System.out.print("digite a temperatura em fhrenheit: ");
		f = teclado.nextDouble();
		//processamento
		c=(5*(f-32))/9;
		//saida
		System.out.println("temperatura em Celcius: " + formatador.format(c) + "°C");
		teclado.close();

	}

}
