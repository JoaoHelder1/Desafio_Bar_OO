package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entitties.Bill;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bill client = new Bill();

		System.out.printf("Sexo: ");
		client.gender = sc.next().charAt(0);
		
		while(client.gender != 'M'&& client.gender != 'F') {
			System.out.printf("O sexo informado está incorreto!%n");
			System.out.printf("Entre com as letras M ou F ");
			client.gender = sc.next().charAt(0);
			System.out.println();
		}
		
		
		System.out.printf("Quantidade de cervejas: ");
		client.beer = sc.nextInt();

		System.out.printf("Quantidade de refrigerantes: ");
		client.softDrink = sc.nextInt();

		System.out.printf("Quantidade de espetinhos: ");
		client.barbecue = sc.nextInt();

		System.out.printf("%n");

		System.out.printf("RELATÓRIO%n");
		
		
		System.out.printf("Consumo = R$ %.2f%n", client.feeding());
		
		if (client.cover() == 4.00)
			System.out.printf("Couvert = R$ %.2f%n", client.cover());
		else
			System.out.println("Isento de Couvert");
			
		System.out.printf("Ingresso = R$ %.2f%n%n", client.ticket());
		System.out.printf("Valor a pagar = R$ %.2f", client.total());
		
		sc.close();
	}

}
