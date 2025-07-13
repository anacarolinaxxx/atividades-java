//Peça ao usuário que digite a sua idade e diga se a pessoa é maior de idade ou menor de idade, usando o operador ternário.

package curso_programacao;
import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a sua idade: ");
		int idade = sc.nextInt();
		
		String maioridade = (idade <= 18) ? "Menor de de idade" : "Maior de idade";
		
		System.out.println(maioridade);
		
		sc.close();
		
	}

}
