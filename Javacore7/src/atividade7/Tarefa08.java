package atividade7;

import java.util.Scanner;

public class Tarefa08 {


	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de X: ");
		float valorX = sc.nextFloat();

		System.out.println("Digite o valor do Y: ");
		float valorY = sc.nextFloat();

		float valorZ = (valorX * valorY) + 5;

		if (valorZ <= 0) {
			System.out.println("A");
		} else if (valorZ <= 100) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}

		sc.close();
	}
	
}
