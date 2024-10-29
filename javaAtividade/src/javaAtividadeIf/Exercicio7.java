package javaAtividadeIf;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		        float n1, n2;
		        int operacao;
		        
		        Scanner sc = new Scanner(System.in);
		        
		        System.out.print("Digite o 1º número: ");
		        n1 = sc.nextFloat();
		        
		        System.out.print("Digite o 2º número: ");
		        n2 = sc.nextFloat();
		        
		        System.out.print("Operação (1: Soma, 2: Subtração, 3: Multiplicação, 4: Divisão): ");
		        operacao = sc.nextInt();
		        
		        switch (operacao) {
		            case 1:
		                float soma = n1 + n2;
		                System.out.printf("%.1f + %.1f = %.1f%n", n1, n2, soma);
		                break;
		            case 2:
		                float sub = n1 - n2;
		                System.out.printf("%.1f - %.1f = %.1f%n", n1, n2, sub);
		                break;
		            case 3:
		                float mult = n1 * n2;
		                System.out.printf("%.1f * %.1f = %.1f%n", n1, n2, mult);
		                break;
		            case 4:
		                if (n2 != 0) {
		                    float div = n1 / n2;
		                    System.out.printf("%.1f / %.1f = %.1f%n", n1, n2, div);
		                } else {
		                    System.out.println("Erro: Divisão por zero não é permitida.");
		                }
		                break;
		            default:
		                System.out.println("Operação Inválida!");
		                break;
		        }
		        
		        sc.close();
	}
}