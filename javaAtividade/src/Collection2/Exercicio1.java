package Collection2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		Scanner sc = new Scanner(System.in);
		int opcao;
		
		do {
			System.out.println("\nMenu de Opções:");
            System.out.println("1: Adicionar Cliente na fila");
            System.out.println("2: Listar todos os clientes ");
            System.out.println("3: Retirar Cliente da fila");
            System.out.println("0: Finalizar o programa");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            
            switch(opcao) {
            
            
            case 1: 
            	System.out.print("Digite o nome do cliente: ");
            	String cliente = sc.next();
            	fila.add(cliente);
            	System.out.println("Cliente adicionado!");
            	break;
            	
            case 2: 
            	if(fila.isEmpty()) {
            		System.out.println("A Fila está vazia");
            	} else {
            		System.out.println("/nLista de clientes na fila: " + fila);
            	}
            	
            	break;
            	
            case 3:
            	if(fila.isEmpty()) {
            		System.out.println("A Fila está vazia!");
            	} else {
            		System.out.println(fila.remove());
            	}
            	break;
            	
            case 0: {
            	System.out.println("Programa finalizado!");
            }
            default:
            	System.out.println("Número inválido");
            }
            
		}while(opcao != 0);
		
		sc.close();
	}

}
