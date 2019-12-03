package lesTableaux;


public class Exercices {

	public Exercices() 
	{
		// TODO Auto-generated constructor stub
	}
	
	public void afficherDeuxSommes(int [] t)
	{
		String couple ="";
		for(int i = 0; i < t.length; i++)
		{
			for(int j = 0; j < t.length; j++)
			{
				if((t[i] + t[j])==0)
				{
					couple += t[i] + ", " + t[j] + "\n";
				}
			}
		}
		
		System.out.println(couple);
	}
	
	
	public void afficherDeuxSommes2(int [] tab)
	{
		String couple = "";
		int borneInf = 0;
		int borneSup = tab.length - 1;
		
		// tri à bulle à faire
		
		// | -9 | -9 | -9 | -8 | -8 | -8 | -8 | -6 | -5 | -5 | -3 | 0 | 0 | 1 | 1 | 2 | 2 | 5 | 7 | 7 | 
		while((borneInf < borneSup) && (tab[borneInf] <= 0) && (tab[borneSup] >= 0) )
		{
			int x = tab[borneInf];
			int y = tab[borneSup];

			
			if((x+y) == 0)
				couple += x + ", " + y +"\n";
			

			if(Math.abs(x) < y)
				borneSup--;
			else
				borneInf++;
		}
		
		System.out.println(couple);
	}
	
	

}
