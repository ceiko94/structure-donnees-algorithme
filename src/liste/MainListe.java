package liste;

import java.util.ArrayList;

public class MainListe {

	public static void main(String[] args) 
	{
		/*ArrayList<Integer> l1 = new ArrayList<Integer>();
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		
		for(int i= 0; i < 20; i++)
			l1.add(i+2);
		
		for(int i= 20; i < 40; i++)
			l2.add(i+3);
		

		ArrayList<Integer> l3 = MainListe.concatenation(l1, l2);
		for(int nombre : l2)
			System.out.print(nombre + " -> ");*/
		
		ListeAuto<Integer> l1 = new ListeAuto<Integer>();
		ListeAuto<Integer> l2 = new ListeAuto<Integer>();
		ListeAuto<Integer> l3 = new ListeAuto<Integer>();
		
		for(int i =0; i < 5; i++)
			l1 = (ListeAuto<Integer>) l1.ajout(i);
		

		/*for(int i =-10; i < -5; i++)
			l2 = (ListeAuto<Integer>) l2.ajout(i);

		l3 = (ListeAuto<Integer>) l1.concatenationCorrection(l2);
		while(!l3.vide())
		{
			System.out.println(l3.tete() + " -> ");
			l3 = (ListeAuto<Integer>) l3.queue();
			
		}*/
		
		l1.affiche();
	}
	
	/*public static ArrayList<Integer> concatenation(ArrayList<Integer> l1, ArrayList<Integer> l2)
	{
		if(l1.isEmpty())
			return l2;
		if(l2.isEmpty())
			return l1;
		else
		{
			int tete = l1.get(0);
			l1.remove(0);
			l2.add(tete);
			return concatenation(l1,l2);
			
		}
	}*/

}
