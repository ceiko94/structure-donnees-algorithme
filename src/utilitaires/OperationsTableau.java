package utilitaires;

import java.util.Random;

public class OperationsTableau 
{	
	
	public static void afficheTableauEntiers(int [] tab)
	{
		int i = 0;
		int taille = tab.length;
		while (i < taille)
		{
			System.out.print( tab[i] + " | ");
			i++;
		}
		System.out.println();
	}
	
	public static int[] genererTableauEntiers(int taille, int borneSuperieur)
	{
		int [] tab = new int[taille];
		Random rdm = new Random();
		for(int i = 0; i < taille; i++)
		{
			int x = rdm.nextInt(borneSuperieur);
			int y = 1;
			if(x >= rdm.nextInt(borneSuperieur))
				y = -1;
			
			tab[i] = x * y;
		}
		
		return tab;
	}
	
	public static int[] getTableauPredefini()
	{
		int [] t = new int [14];
		t[0] = -7;
		t[1] = -5;
		t[2] = -4;
		t[3] = -2;
		t[4] = -1;
		t[5] = 2;
		t[6] = 3;
		t[7] = 6;
		t[8] = 7;
		t[9] = 8;
		t[10] = 11;
		t[11] = 15;
		t[12] = 0;
		t[13] = 0;
		
		return t;
	}
}
