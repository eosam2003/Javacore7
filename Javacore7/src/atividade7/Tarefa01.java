package atividade7;

import java.util.Scanner;

public class Tarefa01 {

public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		float numero = sc.nextFloat();

		if (numero > 0) {
			System.out.println("Positivo");
		} else if (numero == 0) {
			System.out.println("Zero");
		} else {
			System.out.println("Negativo");
		}

		sc.close();
	}
	
}
