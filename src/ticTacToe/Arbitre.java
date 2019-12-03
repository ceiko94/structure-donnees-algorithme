package ticTacToe;
import java.util.Scanner;

import pile.*;

public class Arbitre {
	
	private Joueur joueur;
	private IA ia;
	private PileArrayList<Position> plateauPile;
	Plateau plateau;
	int taillePlateau;

	public Arbitre() 
	{
		plateauPile = new PileArrayList<Position>();
		
		plateau = new Plateau();
		plateau.initialise();
		Position.setHauteur(3);
		ia = new IA();
		joueur = new Joueur();
		System.out.println("Vous pouvez jouer !");
		System.out.println(plateau.toString());
		
	}
	
	public void jouer()
	{		
		int nbCoupsMaximum = plateau.getNombreCase();
		int nbCoupsJoues = 0;
		boolean gagneJoueur = false;
		boolean gagneIA = false;
		boolean egalite = false;
		
		while(nbCoupsJoues < nbCoupsMaximum && !gagneJoueur && !gagneIA & !egalite)
		{
			Position positions;
			
			//Vérifie si la case n'a pas été prise
			do
			{
				positions = joueur.choixPosition();
			}
			while(plateau.caseDejaOccupee(positions));
			
			
			plateauPile.empiler(positions);
			plateau.ajouterJeton(positions, "X");
			++nbCoupsJoues;
			System.out.println(plateau.toString());
			gagneJoueur = plateau.memeSigneVertical("X") || plateau.memeSigneHorizontal("X") || plateau.memeSigneDiagonal("X");
			
			
			if(nbCoupsJoues < nbCoupsMaximum)
			{
				Position positionIA = ia.jouer(plateau);
				++nbCoupsJoues;
				plateauPile.empiler(positionIA);
				plateau.ajouterJeton(positionIA, "O");
				System.out.println(plateau.toString());
				gagneIA = plateau.memeSigneVertical("O") || plateau.memeSigneHorizontal("O") || plateau.memeSigneDiagonal("O");
			}
			else
				egalite = true;
			
			// Annulation des coups précédents			
			if(!gagneJoueur && !gagneIA && !egalite)
			{
				Scanner sc2 = new Scanner(System.in);
				System.out.print("Annuler le(s) dernier(s) coup(s) [oui/non] : ");
				String reponse = sc2.nextLine();
				
				while(!plateauPile.vide() && reponse.equalsIgnoreCase("oui"))
				{
					nbCoupsJoues-=2;
					Position positionSommet = plateauPile.sommet();
					plateau.annulerCoup(positionSommet);
					plateauPile.depiler();
					Position positionSommetIA = plateauPile.sommet();
					plateau.annulerCoup(positionSommetIA);
					plateauPile.depiler();
					System.out.println(plateau.toString());
					System.out.print("Annuler le(s) dernier(s) coup(s) [oui/non] : ");
					reponse = sc2.nextLine();
				}
				
				//Message à afficher au cas le joueur ne comprendrait pas pourquoi il ne peut plus faire de retour en arrière
				if(plateauPile.vide())
				{
					System.out.println("Retour en arrière impossible car le plateau est vide");
				}
			}
			
		}
		
		if(gagneJoueur)
			System.out.println("Vous avez gagné");
		
		if(gagneIA)
			System.out.println("L'ordinateur a gagné");
		
		if(egalite)
			System.out.println("Egalite !");
	}
	
	public void tourJoueur()
	{
		Scanner sc = new Scanner(System.in);
		
	}
	
	public void gagne()
	{
		
	}
	
	
	
	
	
	

}
