package atividadeRepeticao;

import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pares = 0; 
		int impar = 0;
		
		for(int i = 1; i <= 10; i++) {
			int numero = sc.nextInt();
			System.out.println("Digite o " + i + "º numero: " + numero );
			
			if (i % 2 == 0) {
				pares ++;
			} else {
				impar ++;
			}
			
		}
		
		System.out.println("Total de numeros pares:" + pares);
		System.out.println("Total de numeros ímpares:" + impar);
		
		
		sc.close();
	}

}
