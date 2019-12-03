package black_jack_simplifie;

import java.util.*;

public class Main 
{
	public static void main(String [] args)
	{
		Banquier banquier = new Banquier();
		banquier.remplirDeck();
		Arbitre arbitre = new Arbitre(banquier);
		arbitre.creationDesJoueurs();
		arbitre.deroulement();
		
	}
	
	
	
	
	

}
