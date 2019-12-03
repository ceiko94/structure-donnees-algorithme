package test;
import java.util.*;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		
		for(int i = 0; i < 15; i++)
			l1.add(i);
		

		for(int i = 20; i < 40; i++)
			l2.add(i);
		
		ArrayList<Integer> l3 = Fonctions.concatenation(l1, l2);
		for(int nombre : l3)
		{
			System.out.print(nombre + " -> ");
		}

	}

}
