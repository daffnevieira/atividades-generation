package atividadeCollection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio4 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        Set<Integer> numeros = new HashSet<>();
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

        System.out.println("List:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        System.out.print("\nDigite o número que você deseja encontrar: ");
        int numeroParaBuscar = scanner.nextInt();

        if (numeros.contains(numeroParaBuscar)) {
            System.out.println("Número " + numeroParaBuscar + " Encontrado!");
        } else {
            System.out.println("O número " + numeroParaBuscar + " não foi encontrado!");
        }

        scanner.close();
	}
}
