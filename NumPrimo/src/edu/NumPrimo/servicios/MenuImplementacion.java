package edu.NumPrimo.servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz {

	

	public int menu()
	
	{
		
		System.out.println("Introduce un número y sacaré tantos primos como el número sea");
		Scanner mi2 = new Scanner(System.in);
		int numeroIntroducido = mi2.nextInt();
		
		
		System.out.println(numeroIntroducido);
		
		return numeroIntroducido;
	}
}
