package partiel;
import java.util.*;

public class MainPartiel2017 {

	public static void main(String[] args) 
	{
		int [] t = new int [10];
		for(int i = 0; i < 10; i++)
		{
			int nombre = (int) (Math.random() * 30);
			System.out.print(nombre + " -> ");
			t[i] = nombre;
		}
		try 
		{
			Thread.sleep(5000);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\nLe résultat de la fonction m1 est : " + m1(t));

	}
	
	public static int m1(int [] t)
	{
		int v2, v1 = t[0];
		int i =1;
		while(i < t.length && t[i] == v1)
			i++;
		if(i == t.length)
			return v1;
		if(t[i] > v1)
		{
			v2=v1;
			v1 = t[i];
		}
		else
			v2 = t[i];
		for(int j = i +1; j < t.length; j++)
		{
			if(t[j] > v1)
			{
				v2 = v1;
				v1 = t[j];
			}
			else if(t[j] > v2)
				v2 = t[j];
		}
		
		return v2;
	}
	/**
	 * test
	 * @author : Cheikna
	 * 
	 * 
	 * 
	 */

}
