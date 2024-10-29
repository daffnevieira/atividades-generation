package javaAtividadeIf;

import java.util.Scanner;

public class Exercicio1if {
	
	public static void main(String[] args) {
		
		int numA, numB, numC, soma;  //Variaveis de numeros inteiros
		
		Scanner sc = new Scanner(System.in); //Objeto Scanner
		
		System.out.println("Digite o numero A"); 
		numA = sc.nextInt();					//Variavel para entrada de dados
		
		System.out.println("Digite o numero B");
		numB = sc.nextInt();
		
		System.out.println("Digite o numero C");
		numC = sc.nextInt();
		
		soma = numA + numB;             //Soma da entrada A e B
		
		
		if (soma > numC) {		// Se a soma de A + B for maior que o número C...
	        System.out.println("A soma de A + B é maior que C.");
	            
	    } else if (soma < numC) {		//Se a soma for menor que o numero C
	    	  
	        System.out.println("A soma de A + B é menor que C.");
	            
	     } else { 						//Se nenhuma das condicionais então...
	    	  
	        System.out.println("A soma de A + B é igual a C.");
	     }

		  
	        sc.close();  				//Finaliza Scanner
	        
	
	}	
	


}
