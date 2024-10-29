package javaAtividadeIf;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		double valor;
		
		String produtos = "Código do Produto | Produto              | Preço Unitário\n" +
                 "-----------------------------------------------\n" +
                 "1                 | Cachorro Quente      | R$ 10.00\n" +
                 "2                 | X-Salada            | R$ 15.00\n" +
                 "3                 | X-Bacon             | R$ 18.00\n" +
                 "4                 | Bauru               | R$ 12.00\n" +
                 "5                 | Refrigerante        | R$ 8.00\n" +
                 "6                 | Suco de laranja     | R$ 13.00\n";
		 
		System.out.println(produtos);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Código do Produto");
		int cod = sc.nextInt();
		
		System.out.println("Quantidade do Produto");
		int qtd = sc.nextInt();
		
		
        switch (cod) {
        case 1:
            valor = 10.00; // Cachorro Quente
            break;
        case 2:
            valor = 15.00; // X-Salada
            break;
        case 3:
            valor = 18.00; // X-Bacon
            break;
        case 4:
            valor = 12.00; // Bauru
            break;
        case 5:
            valor = 8.00;  // Refrigerante
            break;
        case 6:
            valor = 13.00; // Suco de laranja
            break;
        default:
            System.out.println("Código do produto inválido.");
            return;
            
    }
        
        double total = valor * qtd;
        System.out.printf("O total da compra é: R$ %.2f%n", total);
		
		
		

	}

}
