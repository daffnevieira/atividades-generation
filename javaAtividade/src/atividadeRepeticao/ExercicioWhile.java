package atividadeRepeticao;

import java.util.Scanner;

public class ExercicioWhile {

    public static void main(String[] args) {
    	//variaveis para identidade de genero
        int mulher = 0;
        int homem = 0;
        int naobinario = 0;
        int mulhertrans = 0;
        int homemtrans = 0;
        int outros = 0;
        //variaveis para pessoa dev
        int back = 0;
        int front = 0;
        int mobile = 0;
        int fullstack = 0;
        //variaveis para contagem de pessoas
        int pessoas = 0;
        int todasIdades = 0;
        int totalHomensMaiores40 = 0;
        int totalNaoBiMenores30 = 0;

        Scanner sc = new Scanner(System.in);
        String continua = "S";

        while (continua.equalsIgnoreCase("S")) {
            System.out.println("Digite a idade: ");
            int idade = sc.nextInt();
            todasIdades += idade;
            pessoas++;
            
            //genero
            System.out.println("Digite sua identidade de Gênero: ");
            System.out.println("1 – Mulher Cis\r\n"
                    + "2 – Homem Cis\r\n"
                    + "3 – Não Binário\r\n"
                    + "4 – Mulher Trans\r\n"
                    + "5 – Homem Trans\r\n"
                    + "6 – Outros\r\n"
            );
            int identidade = sc.nextInt();
            switch (identidade) {
                case 1:
                    mulher++;
                    break;
                case 2:
                    homem++;
                    break;
                case 3:
                    naobinario++;
                    break;
                case 4:
                    mulhertrans++;
                    break;
                case 5:
                    homemtrans++;
                    break;
                case 6:
                    outros++;
                    break;
                default:
                    System.out.println("Opção inválida");
            }

            //profissão
            System.out.println("Digite a sua profissão como pessoa desenvolvedora: ");
            System.out.println("1 – Backend\r\n"
                    + "2 – Frontend\r\n"
                    + "3 – Mobile\r\n"
                    + "4 – FullStack\r\n"
            );
            int dev = sc.nextInt();

            switch (dev) {
                case 1:
                    back++;
                    break;
                case 2:
                    front++;
                    break;
                case 3:
                    mobile++;
                    if (identidade == 2 || identidade == 5) {
                        if (idade > 40) {
                            totalHomensMaiores40++;
                        }
                    }
                    break;
                case 4:
                    fullstack++;
                    if (identidade == 3 && idade < 30) {
                        totalNaoBiMenores30++;
                    }
                    break;
                default:
                    System.out.println("Opção inválida");
            }

            //fim do programa
            System.out.println("Deseja continuar? S/N");
            continua = sc.next();
        }
        //pesquisas finais
        System.out.println("Total de pessoas desenvolvedoras Backend: " + back);
        System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + (mulher + mulhertrans + front));
        System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + totalHomensMaiores40);
        System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + totalNaoBiMenores30);
        System.out.println("Total de Homens Trans: " + homemtrans);
        System.out.println("O número total de pessoas que responderam à pesquisa: " + pessoas);
        //media
        if (pessoas > 0) {
            System.out.println("A média de idade das pessoas que responderam à pesquisa: " + (todasIdades / pessoas));
        } else {
            System.out.println("Ninguém respondeu.");
        }

        sc.close();
    }
}
