package lesTableaux;

public class Tri {

	public Tri() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public static int[] triParInsertion(int[] tab)
	{
		for(int i = 0; i < tab.length; i++)
		{
			int valeurATriee = tab[i];
			int k = i -1;
			while(k > -1 && valeurATriee < tab[k])
			{
				tab[k+1] = tab[k];
				tab[k] = valeurATriee;
				valeurATriee = tab[k];
				k--;
			}
		}
		
		return tab;
	}
	
	public static int[] triParComptage(int [] tab)
	{
		int min = tab[0];
		int max = tab[0];
		int longTab = tab.length;
		
		
		for(int i = 1; i < longTab; i++)
		{
			max = (tab[i] > max) ? tab[i] : max;
			min = (tab[i] < min) ? tab[i] : min;
		}
		
		int nbValeurs = (min < 0) ? (max - min + 1) : (max + min + 1);

		int [][] occurrences = new int[2][nbValeurs];
		int j = 0;
		
		for(int i = min; i <= max; i++)
			occurrences[0][j++] = i; 

		
		int deca = (min < 0) ? -min : min;
		
		
		for(int i = 0; i < longTab; i++)
			occurrences[1][tab[i] + deca] =  occurrences[1][tab[i] + deca] + 1;

		
		int indexTab = 0;
		for(int i = 0; i < occurrences[0].length; i++)
		{
			if(occurrences[1][i] > 0)
			{
				for(int k = 0; k < occurrences[1][i]; k++)
					tab[indexTab++] = occurrences[0][i];		
			}
		}
		//System.out.println();
		return tab;
	}
	
	public static int rechercheMaximum(int[] tab)
	{
		int max = tab[0];
		int longTab = tab.length;
		
		
		for(int i = 1; i < longTab; i++)
			max = (tab[i] > max) ? tab[i] : max;
			
		return max;
	}

}
