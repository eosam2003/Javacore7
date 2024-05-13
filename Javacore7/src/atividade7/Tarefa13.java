package atividade7;

import java.util.Scanner;

public class Tarefa13 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a descrição do produto: ");
        String descricao = sc.nextLine();

        System.out.print("Digite a quantidade adquirida: ");
        int quantidade = sc.nextInt();

        System.out.print("Digite o preço unitário: ");
        double precoUnitario = sc.nextDouble();

        double total = quantidade * precoUnitario;
       
        double desconto;
        if (quantidade <= 5) {
            desconto = total * 0.02;
        } else if (quantidade <= 10) {
            desconto = total * 0.03;
        } else {
            desconto = total * 0.05;
        }

        double totalAPagar = total - desconto;

        System.out.printf("Descrição do produto: %s%n", descricao);
        System.out.printf("Quantidade adquirida: %d%n", quantidade);
        System.out.printf("Preço unitário: %.2f%n", precoUnitario);
        System.out.printf("Total: %.2f%n", total);
        System.out.printf("Desconto: %.2f%n", desconto);
        System.out.printf("Total a pagar: %.2f%n", totalAPagar);

        sc.close();
    }
	
}
