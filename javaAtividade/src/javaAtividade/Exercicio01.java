package javaAtividade;

import java.util.Scanner;

public class Exercicio01{

	public static void main(String[] args) {
		float salario, abono, novoSalario;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salário:");
		salario = sc.nextFloat();
		
		System.out.println("Digite o abono:");
		abono = sc.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("Novo Salario: " + novoSalario);
		
		sc.close();
	}

}
