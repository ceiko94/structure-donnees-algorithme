package exercicesPile;
import java.util.*;
import pile.*;

public class ToursHanoi {
	
	int nbDisques;
	int nbPilliers = 3;
	static int compteur = 0;

	public ToursHanoi() 
	{
		// TODO Auto-generated constructor stub
		System.out.print("Nombre de disques : ");
		int nbDisquesChoisi =  new Scanner(System.in).nextInt();
		this.nbDisques = nbDisquesChoisi;
	}
	
	public static void toursHanoi(int n)
	{
		
	}
	
	public void dessinerEtape()
	{
		//Repeter l'action pour les 3 pilliers
		//for(int i= 0 ; i < 3; i++)
		
	}

}
