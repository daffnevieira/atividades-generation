package atividadeCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<>();

		System.out.println("Digite 5 cores: ");

		for (int i = 0; i < 5; i++) {
			String entradaCor = sc.nextLine();
			cores.add(entradaCor);

		}
		if (cores.size() == 5) {
			System.out.println("\nListar todas as cores: ");
			for (String entradaCor : cores) {
				System.out.println(entradaCor);
			}
		}

		Collections.sort(cores);

		System.out.println("\nOrdenar as cores: ");
		for (String entradaCor : cores) {
			System.out.println(entradaCor);
		}
		
		sc.close();

	}

}
