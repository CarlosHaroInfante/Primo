package edu.NumPrimo.servicios;


public class PrimoImplementacion implements PrimoInterfaz {


	public boolean primo(long comprobar) 
	{
		boolean primo = true;
		
		for (int i = 2; i<comprobar; i++) 
		{
			if (comprobar%i == 0)
				primo = false;
				break;
				
		}
		
		return primo;
		
	}
	
}
