package atividadeRepeticao;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		int contar = 0;
		int soma = 0;
		double mediaFinal;
		
		System.out.println("Digite 0 para sair do loop");
		do {
				System.out.println("Digite o um numero: ");
				numero = sc.nextInt();
				
				if (numero != 0 && numero % 3 == 0) {
	                soma += numero;
	                contar++;
	            }
				
				mediaFinal = soma / contar;	
			
		}while(numero != 0);
		
		if (contar > 0) {
			System.out.println("A média de todos os números múltiplos de 3 é: " + mediaFinal);
		} else {
			System.out.println("Nenhum numero multiplo de 3 foi enviado");
		}

		sc.close();
	}

}
