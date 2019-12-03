package black_jack_simplifie;

import java.util.*;

public class Banquier 
{
	
	private ArrayList<Carte> deckJeu;
	private int nombreCartesMax = 52;
	private int nbMax;
	

	public Banquier() 
	{
		deckJeu = new ArrayList<Carte>();
	}
	
	public void remplirDeck() 
	{
		int nombreCarteTotal = 52; //52 - 1

		ArrayList<Carte> jeuCarte = this.genererDeckNormal();
		
		Random rdm = new Random();
		int nbCarte = 0;
		for(int i = 0; i < 52; i++)
		{
			nbCarte += 1;
			Carte carte = jeuCarte.get(rdm.nextInt(nombreCarteTotal--));
			jeuCarte.remove(carte);
			deckJeu.add(carte);
		}
		
			
	}
	
	
	
	public ArrayList<Carte> getDeck()
	{
		
		return deckJeu;
	}
	
	public Carte distribuerCarte()
	{
		int nombreCartesRestantes = deckJeu.size() - 1 ;
		Carte carte = (nombreCartesRestantes > 0) ? deckJeu.get(nombreCartesRestantes) : null;
		
		if(nombreCartesRestantes > 0)
			deckJeu.remove(nombreCartesRestantes);
		
		return carte;
		
	}
	
	private ArrayList<Carte> genererDeckNormal()
	{
		ArrayList<Carte> deck = new ArrayList<Carte>();		
		
		this.ajouterCarteParSigne(Signe.COEUR, deck);					
		this.ajouterCarteParSigne(Signe.CARREAU, deck);					
		this.ajouterCarteParSigne(Signe.PIQUE, deck);					
		this.ajouterCarteParSigne(Signe.TREFLE, deck);	
		
		return deck;
		
	}
	
	private void ajouterCarteParSigne(Signe signe, ArrayList<Carte> liste)
	{
		liste.add(new Carte(signe, Figure.AS));
		liste.add(new Carte(signe, Figure.DEUX));
		liste.add(new Carte(signe, Figure.TROIS));
		liste.add(new Carte(signe, Figure.QUATRE));
		liste.add(new Carte(signe, Figure.CINQ));
		liste.add(new Carte(signe, Figure.SIX));
		liste.add(new Carte(signe, Figure.SEPT));
		liste.add(new Carte(signe, Figure.HUIT));
		liste.add(new Carte(signe, Figure.NEUF));
		liste.add(new Carte(signe, Figure.DIX));
		liste.add(new Carte(signe, Figure.VALET));
		liste.add(new Carte(signe, Figure.DAME));
		liste.add(new Carte(signe, Figure.ROI));
	}
	
	public void afficherDeck()
	{
		for(int i = 0; i < 52; i++)
		{
			Carte carte = deckJeu.get(i);
			carte.afficher();
		}
	}

}
