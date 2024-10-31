package atividadeVetores;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        int[] vetor = new int[10];
		        int total = 0;
		        double media;

		        System.out.println("Digite 10 números inteiros:");
		        for (int i = 0; i < 10; i++) {
		            vetor[i] = sc.nextInt();
		            total += vetor[i]; 
		        }

		        System.out.println("Elementos nos índices ímpares:");
		        for (int i = 1; i < vetor.length; i += 2) {
		            System.out.print(vetor[i] + " ");
		        }
		       
		        System.out.println("Elementos pares:");
		        for (int i = 0; i < vetor.length; i++) {
		            if (vetor[i] % 2 == 0) {
		                System.out.print(vetor[i] + " ");
		            }
		        }

		        
		        media = (double) total / vetor.length;
		        System.out.println("Soma: " + total);
		        System.out.printf("Média: %.2f\n", media);

		        sc.close();
	}

	

}
