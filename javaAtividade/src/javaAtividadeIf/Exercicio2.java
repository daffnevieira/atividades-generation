package javaAtividadeIf;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		numero = sc.nextInt();
		
		if (numero > 0) {
			if(numero % 2 == 0) {
				System.out.printf("O número %d é par e positivo!", numero);
		
			} else if(numero % 2 != 0) {
				System.out.printf("O número %d é impar e positivo", numero);
			}
			
		} 
		else if (numero < 0) {
			
			if(numero % 2 == 0) {
				System.out.printf("O número %d é par e negativo", numero);
				
			} else if(numero % 2 != 0) {
				System.out.printf("O número %d é impar e negativo", numero);
			}
		}
		

		sc.close();
	}

}
