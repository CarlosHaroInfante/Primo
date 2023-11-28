package edu.NumPrimo.controladores;


import edu.NumPrimo.servicios.MenuImplementacion;
import edu.NumPrimo.servicios.MenuInterfaz;
import edu.NumPrimo.servicios.PrimoImplementacion;
import edu.NumPrimo.servicios.PrimoInterfaz;

public class Inicio
{

	public static void main(String[] args) {
		
	MenuInterfaz menu = new MenuImplementacion();
	PrimoInterfaz primo = new PrimoImplementacion();
	
	
	
	int numeroElegido = menu.menu();
	
	long numero = 1;
	
	for(long numero1 = 1; numero<numeroElegido; numero1 ++)
	{
		if (primo.primo(numero1)) 
		{
			System.out.println(numero1);
			numero++;
			
		}
		
		
		
	}
	
	
	
	}
}
