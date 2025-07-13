//Crie um verificador de dias da semana usando SWITCH CASE

package curso_programacao;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String dia;
		
		switch(x){
		case 1: 
			dia = "DOMINGO";
			break;
		
		case 2: 
			dia = "SEGUNDA";
			break;
			
		case 3: 
			dia = "TERÇA";
			break;
			
		case 4: 
			dia = "QUARTA";
			break;
			
		case 5: 
			dia = "QUINTA";
			break;
			
		case 6: 
			dia = "SEXTA";
			break;
			
		case 7: 
			dia = "SABADO";
			break;
			
		default:
			dia = "Valor invalido";
		break;
		
		}
		
		System.out.println("Dia da semana: " + dia);
	}

}
