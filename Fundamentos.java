package fundamentos;

public class Fundamentos {

	public static void main(String[] args) {
		String nome = "Jose de Assis";
		int idade = 25;
		char sexo = 'F';
		double temp = 26.7;
		boolean arCondicionado = false;
		System.out.println("nome: " + nome);
		System.out.println("Uso de variaveis na linguagem JAVA");
		System.out.println("Exemplos: ");
		System.out.println("idade: " + idade);
		System.out.println("sexo: " + sexo);
		System.out.println("temp: " + temp);
		System.out.println("arCondicionado: " + arCondicionado);
		System.out.println("......................................");
		double i = 10;
		System.out.println("Operadores Aritmeticos e  Atribuições");
		System.out.println("Exemplos: ");
		System.out.println("i = " + i);
		System.out.println("i = " + i + " + 5 | i = " + (i + 5 ));
		System.out.println("i = " + i + " - 5 | i = " + (i - 5 ));
		System.out.println("i = " + i + " * 5 | i = " + (i * 5 ));
		System.out.println("i = " + i + " / 5 | i = " + (i / 5 ));
		System.out.println("i = " + i + " % 5 | i = " + (i % 5 ));  
		System.out.println("i += 5     "  + " | i = " + (i += 5 ));
		System.out.println("i -= 5     "  + " | i = " + (i -= 5 ));
		System.out.println("i *= 5     "  + " | i = " + (i *= 5 ));
		System.out.println("i /= 5     "  + " | i = " + (i /= 5 ));
		i++;
		System.out.println("i ++              | i = " + i);
		i--;
		System.out.println("i --              | i = " + i);
		System.out.println("......................................");
		System.out.println("ESTRUTURAS DE CONTROLE");
		System.out.println("");
		System.out.println("Estrtura de controle Condicional");
		System.out.println("Exemplo  - Uso do 'if-else'");
		if(sexo == 'M') {
			System.out.println("Você é do sexo Masculino");
		} else if(sexo == 'F') {
			System.out.println("Alistamento somente para pessoas do sexo Masculino");
		}
		
		if(idade >= 18 & sexo == 'M' ) {
			System.out.println("Alistamento militar obrigatorio");
		} else {
			System.out.println("O alistamento não é obrigatório");
		}
		System.out.println("...........................................");
		System.out.println("");
		System.out.println("Sistema de eleição no Brasil com if - else");
		 
		int idadeCidadao = 25;
		
		if(idadeCidadao < 16) {
			System.out.println("Voto não obrigatorio");
		} else if(idadeCidadao >= 16 && idadeCidadao < 18 || idadeCidadao >=70) {
			System.out.println("voto facultativo");
			
		}else if(idadeCidadao >= 18 && idadeCidadao<=69) {
			System.out.println("Voto obrigatorio");
		}
		System.out.println("------------------------------------------");
		System.out.println("Usando o switch case");
		System.out.println("");
		System.out.println("Escolha uma das opções abaixo:");
		System.out.println("");
		System.out.println("1 - Cadastro de clientes ");
		System.out.println("2 - Cadastro de usuários");
		System.out.println("3 - Relatórios ");
		System.out.println("");
		int opcao = 1;
		switch(opcao) {
		case 1:
			System.out.println("Você escolheu Clientes");
			break;
		case 2:
			System.out.println(" Você escolheu usuários");
			break;
		case 3:
			System.out.println(" Você escolheu Relatórios");
			break;
		default:
			System.out.println(" você escolheu um Opção inválida");
			break;
		}
		
		for(int j = 10; j > 0; j--) {
			System.out.println(j);  // toda vez que J for maior que 0 imprima na tela seu valor
		}
		
		System.out.println(".............................................................................");
		System.out.println("");
		
		
		
		System.out.println("Tabuada  multiplicação");
		
		for(int tabuada = 0; tabuada <= 10; tabuada ++) {
			System.out.println("");
			for (int mult = 0; mult <= 10; mult ++) {
				System.out.println(tabuada + "x" + mult + "=" + (tabuada * mult));
			}
			
			System.out.println(".............................................................................");
			System.out.println("");
			
			
			System.out.println("utilizando o while e do-while");
			
			int contador = 0;
			while(contador <= 10) {
				contador ++;
			}
			
			char novoJogo;
			do {
				System.out.println("Deseja jogar novamente (S/N?");
				novoJogo = 'S';
			} while(novoJogo == 's');
			}
		}
	}

