package atividade7;

import java.util.Scanner;

public class Tarefa03 {

	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Digite o primeiro valor:");
	        int valor1 = sc.nextInt();

	        System.out.println("Digite o segundo valor:");
	        int valor2 = sc.nextInt();

	        System.out.println("Digite o terceiro valor:");
	        int valor3 = sc.nextInt();

	        int maior, segundoMaior;
	        if (valor1 > valor2 && valor1 > valor3) {
	            maior = valor1;
	            segundoMaior = Math.max(valor2, valor3);
	        } else if (valor2 > valor1 && valor2 > valor3) {
	            maior = valor2;
	            segundoMaior = Math.max(valor1, valor3);
	        } else {
	            maior = valor3;
	            segundoMaior = Math.max(valor1, valor2);
	        }
	        int soma = maior + segundoMaior;

	        System.out.println("A soma dos dois maiores valores é: " + soma);
	        sc.close();
  }
}
