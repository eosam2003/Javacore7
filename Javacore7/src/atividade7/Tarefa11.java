package atividade7;

import java.util.Scanner;

public class Tarefa11 {

	public static void main(String[]Args) {
		
		Scanner sc = new Scanner (System.in);	
			
		System.out.println("Digite a quantidade de Morangos: ");
		float morangosKG = sc.nextFloat();
		System.out.println("Digite a quantidade de Maças: ");
		float macaKG = sc.nextFloat();
		
		if(morangosKG <= 5 &&  macaKG <= 5 ) {
			float morangoValorAte5Kg = morangosKG*2.50f;
			float macaValorAte5Kg = macaKG*1.80f;
			float somaValorFinalDasFruts = morangoValorAte5Kg+macaValorAte5Kg;
			System.out.println("Valor total da Compra foi: "+somaValorFinalDasFruts);
			
				if(somaValorFinalDasFruts > 25 && morangosKG+macaKG > 8){
					float somaValorFinalDasFrutasMas10 = 10*somaValorFinalDasFruts/100;
					float somaFinalMas10 = somaValorFinalDasFruts - somaValorFinalDasFrutasMas10;
					System.out.println("Valor total da compra foi: "+somaFinalMas10);
				}
				
		}else if(morangosKG > 5 && macaKG > 5) {
			float morangoValorAcimaDe5Kg = morangosKG*2.20f;
			float macaValorAcimaDe5Kg = macaKG*1.50f;
			float somaValorFinalDasFruts02 = morangoValorAcimaDe5Kg+macaValorAcimaDe5Kg;
			System.out.println("Valor total da Compra foi: "+somaValorFinalDasFruts02);
			
				if(somaValorFinalDasFruts02 > 25 && morangosKG+macaKG > 8) {
					float somaValorMas10_02 = 10*somaValorFinalDasFruts02/100;
					float somaValorFinal02 = somaValorFinalDasFruts02 - somaValorMas10_02;
					System.out.println("Valor total da Compra foi:"+somaValorFinal02);
				}
		}
		sc.close();	
		}
	
}
