package atividade7;

import java.util.Scanner;

public class Tarefa12 {

	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        final int USER_CODE = 1234;
	        final int PASSWORD = 9999;

	        System.out.print("Digite o código do usuário: ");
	        int userCode = sc.nextInt();

	        if (userCode != USER_CODE) {
	            System.out.println("Usuário inválido!");
	        } else {
	            System.out.print("Digite a senha: ");
	            int password = sc.nextInt();

	            if (password != PASSWORD) {
	                System.out.println("Senha incorreta!");
	            } else {
	                System.out.println("Acesso permitido");
	            }
	        }

	        sc.close();
	    }
	
}
