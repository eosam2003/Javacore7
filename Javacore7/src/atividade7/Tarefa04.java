package atividade7;

import java.util.Scanner;

public class Tarefa04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor:");
        int a = sc.nextInt();
        System.out.println("Digite o segundo valor:");
        int b = sc.nextInt();
        System.out.println("Digite o terceiro valor:");
        int c = sc.nextInt();
        
        int temp;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        
        System.out.println("Valores em ordem crescente: " + a + ", " + b + ", " + c);
        sc.close();
    }
	
}
