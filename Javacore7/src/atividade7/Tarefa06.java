package atividade7;

import java.util.Scanner;

public class Tarefa06 {

	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Digite o nome do primeiro time: ");
	        String time1 = sc.nextLine();

	        System.out.println("Digite o número de gols marcados pelo primeiro time: ");
	        int golsTime1 = sc.nextInt();

	        System.out.println("Digite o nome do segundo time: ");
	        sc.nextLine();
	        String time2 = sc.nextLine();

	        System.out.println("Digite o número de gols marcados pelo segundo time: ");
	        int golsTime2 = sc.nextInt();

	        if (golsTime1 > golsTime2) {
	            System.out.println("O vencedor é: " + time1);
	        } else if (golsTime2 > golsTime1) {
	            System.out.println("O vencedor é: " + time2);
	        } else {
	            System.out.println("EMPATE");
	            sc.close();
	        }
	    }
	
}
