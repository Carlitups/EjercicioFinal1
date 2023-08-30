package com.java.clases;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scani = new Scanner(System.in);
		int numero = 0;
		do {
			System.out.println("Menu: ");
			System.out.println("Elige una opcion: ");
			System.out.println("1.Utilizar objeto: ");
			System.out.println("2.Parado: ");
			numero = scanner.nextInt();
			
			if (numero == 1) {
				int v1 = 0;
				String s1 = "";
				System.out.print("Altura: ");
				v1 = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Palabra: ");
				s1 = scanner.nextLine();
				Final1 info = new Final1(v1, s1);
				System.out.println(info.piramide());
				System.out.println(info.segundo());
				
				
			}
		}
		while (numero != 2);
		
		scanner.close();
		
		
	}
	
	
	
}
	
