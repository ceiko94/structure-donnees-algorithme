package utilitaires;

public class Chronometre {

	private final long debut = System.currentTimeMillis();
	
	public double tempsEcoule()
	{
		long maintenant = System.currentTimeMillis();
		return (maintenant - debut) ;// 1000;
	}

}
