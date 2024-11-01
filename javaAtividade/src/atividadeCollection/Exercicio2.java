package atividadeCollection;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> numeros = new ArrayList<Integer>();

		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);


		System.out.print("Digite um número inteiro: ");
		int numeroEntrada = sc.nextInt();

		if (numeros.contains(numeroEntrada)) {
			int posicao = numeros.indexOf(numeroEntrada);
			System.out.printf("O número %d está localizado na posição %d", numeroEntrada, posicao);
			
		} else {
			System.out.printf("O número %d não foi encontrado!", numeroEntrada);
		}

		sc.close();

	}

}
