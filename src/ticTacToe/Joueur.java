package ticTacToe;
import java.util.*;

public class Joueur {

	private String nom;
	private String symbole;
	private int id;
	private static int nbJoueurs = 1;
	
	
	public Joueur() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Ecrivez votre nom : ");
		nom = sc.nextLine();
		//nom = nom.substring(0, 1).toUpperCase() + nom.substring(1, nom.length() -1).toLowerCase();
		id = nbJoueurs++;		
	}
	
	public Joueur(String nom)
	{
		this.nom = nom;
	}
	
	public String getNom()
	{
		return nom;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setSymbole(String sym)
	{
		symbole = sym;
	}
	
	public String getSymbole()
	{
		return symbole;
	}
	
	public Position choixPosition()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Votre position vertical : ");
		System.out.println("| 0 |");
		System.out.println("| 1 |");
		System.out.println("| 2 | ");
		System.out.print("Votre choix [0-2] : ");		
		int y = sc.nextInt();
		
		System.out.println("Votre position horizontal : ");
		System.out.println("| 0 | 1 | 2 |");
		System.out.print("Votre choix [0-2] : ");
		int x = sc.nextInt();
		
		return new Position(x,y);
	}

}
