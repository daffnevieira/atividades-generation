package javaAtividade;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		float sliquido, slbruto, adnoturno, hrextra, descontos;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Salário Bruto: ");
		slbruto = sc.nextFloat();
		
		System.out.println("Adicional Noturno: ");
		adnoturno = sc.nextFloat();
		
		System.out.println("Hora Extra: ");
		hrextra = sc.nextFloat();
		
		System.out.println("Descontos");
		descontos = sc.nextFloat();
		
		
		sliquido = slbruto + adnoturno + (hrextra * 5) - descontos;
		
		System.out.println("Salário Líquido: " + sliquido);
		
		
		
	}
}
