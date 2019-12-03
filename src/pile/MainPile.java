package pile;

public class MainPile {

	
	public static void main(String[] args)
	{
		PileArrayList<String> pl = new PileArrayList<String>();
		pl.empiler("debut");
		pl.empiler("cheikna");
		pl.empiler("dansoko");
		pl.empiler("19 ans");
		pl.empiler("1998");
		pl.empiler("fin");
		while(!pl.vide())
		{
			System.out.println(pl.sommet());
			pl.depiler();
		}
		
		System.out.println("********************** INVERSION DE LA PILE ************************");
		PileArrayList<String> pl2 = new PileArrayList<String>();
		pl2.empiler("debut");
		pl2.empiler("cheikna");
		pl2.empiler("dansoko");
		pl2.empiler("19 ans");
		pl2.empiler("1998");
		pl2.empiler("fin");
		PileArrayList<String> pileInverse = new PileArrayList<String>();
		pileInverse = pl2.inverserPile();
		while(!pileInverse.vide())
		{			
			System.out.println(pileInverse.sommet());
			pileInverse.depiler();
		}
		
	}
		
	

}
