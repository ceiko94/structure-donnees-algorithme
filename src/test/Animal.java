package test;

public class Animal {

	private int age;
	private int poids;
	private String nom;
	protected int attributProtected;
	public int attributPublic;
	
	public Animal(String nom) 
	{
		this.nom = nom;
	}
	
	public int getPoids()
	{
		return poids;
	}
	
	public void setPoids(int poids)
	{
		this.poids = poids;
	}
	
	public String getNom()
	{
		return nom;
	}

}
