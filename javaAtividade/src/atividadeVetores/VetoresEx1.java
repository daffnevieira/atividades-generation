package atividadeVetores;

import java.util.Scanner;

public class VetoresEx1 {

	public static void main(String[] args) {
		// 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
		int vetor[] = { 8, 5, 6, 4, 9, 7, 2, 1, 3, 6, 10 };
		int numero;
		boolean encontrar = false;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero que você deseja encontrar: ");
		numero = sc.nextInt();

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numero) {
				encontrar = true;
				System.out.printf("O número %d está na posição %d : ", numero, i);
				break;
			}
		}
		
		if (!encontrar) {
			System.out.printf("O número %d não foi encontrado\n", numero);
		}

		sc.close();

	}

}
