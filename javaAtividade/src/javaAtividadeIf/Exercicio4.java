package javaAtividadeIf;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		String primeira, segunda, terceira;
		Scanner sc = new Scanner(System.in);

	    System.out.println("Digite uma caracteristica ex: vertebrado ou invertebrado ");
	    primeira = sc.nextLine().toLowerCase();
	      
	    System.out.println("Digite outra  característica ex: inseto, ave, mamífero ou anelídeo ");
	    segunda = sc.nextLine().toLowerCase();
	    
	    System.out.println("Digite outra  característica ex: carnívoro, onívoro, herbívoro ou hematófago");
	    terceira = sc.nextLine().toLowerCase();
	    
	    
	    if(primeira.equals("vertebrado")) {
	    	if(segunda.equals("mamífero")) {
	    		if(terceira.equals("onívoro")) {
	    			System.out.println("Homem");
	    		}
	    		else if(terceira.equals("herbívoro")) {
	    			System.out.println("Vaca");
	    		}
	    		else {
	    			System.out.println("não identificado");
	    		}
	    	}
	    	
	    	
	    	else if(segunda.equals("ave")) {
	    		if(terceira.equals("carnívoro")) {
	    			System.out.println("Águia");
	    		}
	    		else if(terceira.equals("onívoro")) {
	    			System.out.println("Pomba");
	    		}
	    		else {
	    			System.out.println("Não identificado");
	    		}
	    	}
	    }
	    	
		else if(primeira.equals("invertebrado")) {
			if(segunda.equals("anelídeo")) {
	    		if(terceira.equals("hematófago")) {
	    			System.out.println("Sanguessuga");
	    		}
	    		else if(terceira.equals("onívoro")) {
	    			System.out.println("Minhoca");
	    		}
	    		else {
	    			System.out.println("não identificado");
	    		}
	   
	    	}
			else if(segunda.equals("inseto")) {
				if(terceira.equals("hematófago")) {
					System.out.println("Pulga");
	    		}
	    		else if(terceira.equals("herbívoro")) {
	    			System.out.println("Lagarta");
	    		}
	    		else {
	    			System.out.println("Não identificado");
	    		}
			}
		}
	    sc.close();
	}
}
