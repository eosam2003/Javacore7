package atividade7;

import java.util.Scanner;

public class Tarefa07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int primeiroNumero = sc.nextInt();

        System.out.println("Digite o segundo número:");
        int segundoNumero = sc.nextInt();

        if (primeiroNumero == segundoNumero) {
            System.out.println("Números iguais");
        } else if (primeiroNumero > segundoNumero) {
            System.out.println("Primeiro é maior");
        } else {
            System.out.println("Segundo é maior");
        }

        sc.close();
    }
	
}
