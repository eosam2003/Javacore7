package atividade7;

import java.util.Scanner;

public class Tarefa09 {

	   public static void main(String[] args) {
		   
	        double precoGasolina = 3.30;
	        double precoAlcool = 2.90;
	     
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Digite o número de litros vendidos: ");
	        double litrosVendidos = sc.nextDouble();
	        System.out.print("Digite o tipo de combustível (A para álcool, G para gasolina): ");
	        char tipoCombustivel = sc.next().charAt(0);
	        
	        double valorAPagar = 0.0;
	        if (tipoCombustivel == 'A' || tipoCombustivel == 'a') {
	            valorAPagar = litrosVendidos * precoAlcool;
	        } else if (tipoCombustivel == 'G' || tipoCombustivel == 'g') {
	            valorAPagar = litrosVendidos * precoGasolina;
	        } else {
	            System.out.println("Tipo de combustível inválido. Por favor, insira A para álcool ou G para gasolina.");
	            return;
	        }
	        
	        System.out.println("Valor a ser pago pelo cliente: R$ " + valorAPagar);
	        sc.close();
  }
}
