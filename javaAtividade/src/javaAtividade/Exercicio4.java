package javaAtividade;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		float num1, num2, num3, num4, dif;
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o primeiro número: ");
		num1 = sc.nextFloat();	
		
		System.out.println("Digite o segundo número: ");
		num2 = sc.nextFloat();	
		
		System.out.println("Digite o terceiro número: ");
		num3 = sc.nextFloat();	
		
		System.out.println("Digite o quarto número: ");
		num4 = sc.nextFloat();	
		
		dif = (num1 * num2 ) - (num3 * num4);
		
		System.out.printf("A diferença é: " + dif);
		
		sc.close();

	}
}