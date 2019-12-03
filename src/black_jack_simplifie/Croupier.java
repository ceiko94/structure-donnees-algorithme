package black_jack_simplifie;

import java.util.ArrayList;
import java.util.Scanner;

public class Croupier 
{
	private ArrayList<Carte> cartes = new ArrayList<Carte>();
	private int score;
	private int scoreMax;

	public Croupier() 
	{
		scoreMax = 17;
	}
	
	public boolean demandeCarteCroupier()
	{
		return score < scoreMax;
	}
	
	
	public void ajouterCarteCroupier(Carte carte)
	{
		cartes.add(carte);
		score += carte.getFigure().getValeur();
	}
	
	public int getScore()
	{
		return score;
	}
	
	public boolean perdu()
	{
		return score > 21;
	}
	
	
	
	

}
