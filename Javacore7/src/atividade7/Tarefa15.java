package atividade7;

import java.util.Scanner;

public class Tarefa15 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a idade do empregado: ");
	        int idade = scanner.nextInt();

	        System.out.print("Digite os anos de serviço do empregado: ");
	        int anosDeServico = scanner.nextInt();
	       
	        boolean podeAposentar = (idade >= 65) || (anosDeServico >= 30) || (idade >= 60 && anosDeServico >= 25);

	        if (podeAposentar) {
	            System.out.println("O empregado está qualificado para a aposentadoria.");
	        } else {
	            System.out.println("O empregado não está qualificado para a aposentadoria.");
	        }

	        scanner.close();
	    }
	
}
