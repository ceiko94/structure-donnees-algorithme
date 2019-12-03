package black_jack_simplifie;

import java.util.ArrayList;
import java.util.Scanner;


public class Joueur 
{
	private static int idJoueur = 0;
	
	private String nom;
	private int score;
	private boolean elimine = false;
	private ArrayList<Carte> cartes = new ArrayList<Carte>();


	public Joueur(String nom) 
	{
		idJoueur++;
		
		this.nom= nom;
		this.score= 0;
		
	}
	
	public void ajouterCarte(Carte carte)
	{
		cartes.add(carte);
		
		if(carte.getFigure() == Figure.AS)
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Choisissez la valeur 1 ou 11 pour votre AS [1/11] -> ");
			score += sc.nextInt();
		}
		else
		{
			score += carte.getFigure().getValeur();
		}
		
		if(this.perdu())
			elimine = true;
	}
	
	public boolean perdu()	{
		return score > 21;
	}
	
	public void setElimine(boolean elimine)	{
		this.elimine = elimine;
	}


	public int getScore() 	{
		return score;
	}
	
	public String resultat(int scoreCroupier)	{
		return (!elimine && score >= scoreCroupier && scoreCroupier <= 21) ? nom + " : Gagné !" : nom + " : Perdu !";
	}


	public void setScore(int score) 	{
		this.score += score;
	}
	
	public String getNom()	{
		return nom;
	}


}
