package atividadeCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Set<Integer> numeros = new HashSet<>();

		System.out.print("Set: ");
		for (int i = 0; i < 10;) {
			int numero = scanner.nextInt();
			if (numeros.add(numero)) {
				i++;
			} else {
				System.out.println("Número repetido, tente outro.");
			}
		}

		System.out.println("\nListar dados do Set:");
		Iterator<Integer> iterator = numeros.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		Set<Integer> numerosAdd = new HashSet<>();
		System.out.println("Listar dados do Set:");
		for (int i = 0; i < 10; i++) {
			int numero = scanner.nextInt();
			numerosAdd.add(numero);
		}

		System.out.println("\nListar dados do Set:");
		iterator = numerosAdd.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		scanner.close();
	}

}
