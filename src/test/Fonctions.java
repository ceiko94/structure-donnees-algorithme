package test;
import java.util.*;

public class Fonctions {

	public Fonctions() 
	{
		// TODO Auto-generated constructor stub
	}
	
	public static ArrayList<Integer> concatenation (ArrayList<Integer> l1,ArrayList<Integer> l2)
	{
		if(l1.isEmpty())
			return l2;
		if(l2.isEmpty())
			return l2;
		else
		{
			int tete = l2.get(0);
			l2.remove(0);
			ArrayList<Integer> l3 = concatenation(l1,l2);
			l3.add(tete);
			return l3;
		}
			
	}

}
