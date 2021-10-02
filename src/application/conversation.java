package application;

import java.util.Locale;
import java.util.Scanner;

import util.conversaoDeMoeda;

public class conversation {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor do AncapCoin no mercado: ");
		double ancapPrice = sc.nextDouble();
		System.out.print("Quantidade de AncapCoins para adicionar: ");
		double amount = sc.nextDouble();
		double result = conversaoDeMoeda.ancapToReal(amount, ancapPrice);
		System.out.printf("Valor a ser pago em reais: %.2f%n ", result);
		
		
		
			
				
		sc.close();
	}

}
