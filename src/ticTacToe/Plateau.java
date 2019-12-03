package ticTacToe;

public class Plateau {

	private int largeur;
	private int hauteur;
	private String [][] plateau;
	int nbPlacesOccupees = 0;
	
	public Plateau(int h, int l) 
	{
		hauteur = (h >= 3) ? h : 3;
		largeur = hauteur;
		
		plateau = new String[hauteur][largeur];	
		
		
	}
	
	public int getNombreCase()
	{
		return hauteur*hauteur;
	}
	
	public Plateau() 
	{		
		plateau = new String[3][3];	
		hauteur = 3;
		largeur = 3;
	}
	
	public void initialise()
	{
		for(int i = 0; i < hauteur; i++)
		{
			for(int j=0; j < largeur; j++)
				plateau[i][j] = "7";
				
		}
	}
	
	public String toString()
	{
		String plateauString = "--------------------\n";
		for(int i = 0; i < hauteur; i++)
		{
			plateauString += "|";
			for(int j=0; j < largeur; j++)
			{
				plateauString += " " + plateau[i][j] + " |";
			}
			plateauString += "\n--------------------\n";
				
		}
		
		return plateauString;
		
	}
	
	public void ajouterJeton(Position p, String symbole)
	{
		plateau[p.getY()][p.getX()] = symbole;
		nbPlacesOccupees++;
	}
	
	public boolean memeSigneVertical(String symbole)
	{
		boolean gagne = false;
		int nbVerif = 3;
		int i = 0;
		
		while(i < nbVerif && !gagne)
		{
			// marche également mais j'aurais dû mettre des equals 
			gagne = (plateau[0][i] == plateau[1][i] && plateau[0][i] == plateau[2][i] && plateau[0][i].equals(symbole));
			i++;
		}		
		
		return gagne;
	}
	
	public boolean memeSigneHorizontal(String symbole)
	{
		boolean gagne = false;
		int nbVerif = 3;
		int i = 0;
		
		while(i < nbVerif && !gagne)
		{
			// marche également mais j'aurais dû mettre des equals 
			gagne = (plateau[i][0] == plateau[i][1] && plateau[i][0] == plateau[i][2] && plateau[i][0].equals(symbole));
			i++;
		}		
		
		return gagne;		
	}
	
	public boolean memeSigneDiagonal(String symbole)
	{
		// marche également mais j'aurais dû mettre des equals 
		boolean gagneDiag1 = plateau[0][0] == plateau[1][1] && plateau[0][0] == plateau[2][2] && plateau[0][0].equals(symbole) ;
		boolean gagneDiag2 = plateau[0][2] == plateau[1][1] && plateau[0][2] == plateau[2][0] && plateau[0][2].equals(symbole) ;
		
		return gagneDiag1 || gagneDiag2;
		
	}
	
	public void annulerCoup(Position p)
	{
		plateau[p.getY()][p.getX()] = "7";
	}
	
	public boolean caseDejaOccupee(Position p)
	{
		if(!plateau[p.getY()][p.getX()].equals("7"))
			System.out.println("Case déjà prise !");
		
		return plateau[p.getY()][p.getX()] != "7";
	}
	
	public String[][] getTableau()
	{
		return this.plateau;
	}
	
	public boolean plateauComplet()
	{
		return nbPlacesOccupees == this.getNombreCase();
	}

}
