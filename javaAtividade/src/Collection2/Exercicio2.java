package Collection2;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {

	public static void main(String[] args) {

		Stack<String> livros = new Stack<String>();
		Scanner sc = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("\nMenu de Opções:");
			System.out.println("1: Adicionar LIvro na pilha");
			System.out.println("2: Listar todos os livros");
			System.out.println("3: Retirar livro da pilha");
			System.out.println("0: Finalizar o programa");
			System.out.print("Escolha uma opção: ");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome: ");
				String livro = sc.nextLine();
				livros.push(livro);
				System.out.println("Livro adicionado!");
				break;

			case 2:
				if (livros.isEmpty()) {
					System.out.println("A pilha está vazia!");
				} else {
					System.out.println("Pilha:");
					for (String b : livros) {
						System.out.println(b);
					}
				}
				break;

			case 3:
				if (livros.isEmpty()) {
					System.out.println("A pilha está vazia!");
				} else {
					livros.pop();
					System.out.println("Um livro foi retirado!");
				}
				break;

			case 0:
				System.out.println("Programa finalizado!");
				break;

			default:
				System.out.println("Opção inválida");
				break;

			}

		} while (opcao != 0);

		sc.close();

	}

}
