package application;

import java.util.Scanner;

import object.Tenant;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		//Leitura da quantidade de inquilinos 
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		/*Instanciacao do vetor com a quantidade de linhas correspondente
		a quantidade de quartos no prédio*/
		Tenant [] vet = new Tenant [10];
		
		System.out.println();
		//Leitura das informacoes do inquilino
		for (int i = 0; i<n ; i++) {
			System.out.println("Rent #" + (i+1) + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			//Determinando que o vetor na linha "room" apontara para o objeto
			vet [room] = new Tenant (name,email,room);
			System.out.println();
		}
		
		System.out.println("Busy rooms:");
		//Escrita dos quartos que estao ocupados
		for (int i=0 ; i< vet.length; i++) {
			if (vet[i] != null) {
				System.out.println(vet[i]);
			}
		}
		
		System.out.println();
		System.out.print("Available rooms:");
		//Escrita dos quartos disponiveis
		for (int i = 0; i < (vet.length); i++) {
			if (vet[i] == null) {
				System.out.print(" #" + i);
			}
		}
		sc.close();
	}
}
