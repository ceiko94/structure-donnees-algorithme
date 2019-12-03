package ticTacToe;

public class Position {

	private int x;
	private int y;
	private static int hauteur = 3;
	
	public Position(int x, int y) 
	{
		this.x = (x < hauteur) ? x : 0;
		this.y = (y < hauteur) ? y : 0 ;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public static void setHauteur(int haut)
	{
		hauteur = haut;
	}

}
