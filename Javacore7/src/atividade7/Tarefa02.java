package atividade7;

import java.util.Scanner;

public class Tarefa02 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        int valor1 = sc.nextInt();

        System.out.println("Digite o segundo valor:");
        int valor2 = sc.nextInt();

        System.out.println("Digite o terceiro valor:");
        int valor3 = sc.nextInt();
        int maior = valor1;
        if (valor2 > maior) {
            maior = valor2;
        }
        if (valor3 > maior) {
            maior = valor3;
        }
        System.out.println("O maior valor é: " + maior);
        sc.close();
    }
}