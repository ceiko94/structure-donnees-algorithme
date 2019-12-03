package black_jack_simplifie;

import java.util.*;

public class Arbitre 
{
	private ArrayList<Joueur> joueurs = new ArrayList<Joueur>();
	private Banquier banquier;
	private Croupier croupier;
	//private int indexJoueur = 0;	
	private int nombreDeJoueurs;
	

	public Arbitre(Banquier banquier) 
	{
		this.joueurs = new ArrayList<Joueur>();
		nombreDeJoueurs = joueurs.size();
		this.banquier = banquier;
		croupier = new Croupier();
		
	}
	
	public void creationDesJoueurs()
	{
		Scanner sc = new Scanner(System.in);
		String encoreJoueur = "";
		
		// on créé des joueurs tant que 
		do
		{
			System.out.print("Nom de Joueur : ");
			String nom = sc.nextLine();
			joueurs.add(new Joueur(nom));
			System.out.print("Encore un joueur ? [oui/non] ");
			encoreJoueur = sc.nextLine();
			
		}		
		while(encoreJoueur.equalsIgnoreCase("oui"));
		
		nombreDeJoueurs = joueurs.size();
		System.out.println();
	}
	
	public void deroulement()
	{
		boolean partieTerminee = false;
		int indexJoueur = 0;
		int nbJoueurs = joueurs.size();
		
		while(indexJoueur < nbJoueurs)  // Tous les joueurs sont-ils passés ?
		{
			Joueur joueurCourant = joueurs.get(indexJoueur);
			System.out.println("\nAu tour de " + joueurCourant.getNom() +" de jouer !");
			
			//Affiche des scores de tous ceux qui ont reçu des cartes			
			this.getScores(joueurs, nbJoueurs);
			
			if(this.piocherCarte(joueurCourant))
			{
				System.out.print(joueurCourant.getNom() + " a été éliminé !\n");
				joueurCourant.setElimine(true);
			}
			
			indexJoueur++;
		}
		
		this.fin();
		
	}
	
	
	// On ne retourne uniquement un joueur s'il a décidé de tirer une carte	
	public boolean piocherCarte(Joueur joueur)
	{
		Scanner sc = new Scanner(System.in);
		boolean perdu = joueur.perdu();

		System.out.print("Voulez-vous une carte ? [oui/non]");
		
		while(!perdu && sc.nextLine().equalsIgnoreCase("oui"))
		{
			Carte carteRecu = banquier.distribuerCarte();
			System.out.println("*** Votre carte :");
			carteRecu.afficher();
			joueur.ajouterCarte(carteRecu);
			System.out.println("Nouveau Score : " + joueur.getScore());
			perdu = joueur.perdu();
			
			if(!perdu)
				System.out.print("Voulez-vous une carte ? [oui/non]\n");
		}
		
		return perdu;
		
	}
	
	public void getScores(ArrayList<Joueur> j, int max)
	{
		System.out.println("****************** SCORE ******************");
		for(int i = 0; i < max; i++)
		{
			System.out.println("Nom du joueur : " + j.get(i).getNom());
			System.out.println("Score : " + j.get(i).getScore() + "\n");
		}
		System.out.println("*******************************************");
	}
	
	
	public void fin()
	{
		System.out.println("************* Croupier *************");
		while(croupier.demandeCarteCroupier())
			croupier.ajouterCarteCroupier(banquier.distribuerCarte());
		
		System.out.println("Score du croupier : " + croupier.getScore());
		
		
		System.out.println("************* Résultat final *************");
		for(int i = 0; i < joueurs.size(); i++)			
			System.out.println(joueurs.get(i).resultat(croupier.getScore()));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public boolean augmentationScore(Joueur joueur, Carte carte)
	{
		boolean fin = false;
		if (carte.getFigure() == Figure.AS) 
		{
			int valeurAs = 0;
			System.out.print("Voulez-vous que l'as compte comme un 1 ou comme un 11 ? [1/11] : ");
			Scanner sc = new Scanner(System.in);
			valeurAs = sc.nextInt();
			System.out.println("L'as vaut "+ valeurAs+".");
			
			joueur.setScore(valeurAs);
		}
		
		else
		{
			joueur.setScore(carte.getFigure().getValeur());
		}
		
		if(joueur.getScore() > 21 )
		{
			fin = true;
		}
		
		return fin;
	}
	
	public void afficherTableJeu()
	{
		//System.out.println("Croupier : " + score de la carte + " + 1 carte face cachée");
		
		for(int i = 0; i < nombreDeJoueurs; i++)
		{
			Joueur j = joueurs.get(i);
			System.out.println("Joueur : "/*+j.getId()+ " : " */+ j.getNom());
			System.out.println("Score : " + j.getScore() + "\n");
		}
	}

}
