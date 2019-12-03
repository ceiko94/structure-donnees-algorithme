package black_jack_simplifie;


public class Carte 
{
	private Figure figure;
	private Signe signe;
	
	public Carte(Signe signe, Figure figure) 
	{
		this.figure = figure;
		this.signe = signe;
	}
	
	public Figure getFigure()
	{
		return figure;
	}
	
	public Signe getSigne()
	{
		return signe;
	}
	
	public void afficher()
	{
		System.out.println("Figure : " + this.getFigure() );
		System.out.println("Signe : " + signe);
	}
}
