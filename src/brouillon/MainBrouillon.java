package brouillon;

import java.util.ArrayList;

public class MainBrouillon {

	public static void main(String [] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int k = 3; k >= 1; k--)
		{
			empiler(k, list);
		}
		for(int k = 10; k < 12; k++)
		{
			empiler(k, list);
		}

		for(int k = 7; k >= 5; k--)
		{
			empiler(k, list);
		}

		int i = list.size() - 1;
		while(i >= 0)
		{
			System.out.print(list.get(i) + " --- ");
			i--;
		}


	}

	public static boolean palindrome(String s)
	{
		int i = 0; 
		int j = s.length() - 1;
		boolean palindr = true;

		while(i < j && palindr)
		{
			char iChar = s.charAt(i);
			char jChar = s.charAt(j);
			if(iChar == ' ' || iChar == ',')
				i++;
			else
			{
				if(jChar == ' ' || jChar == ',')
					j--;
				else
				{
					palindr = iChar == jChar;
					i++;
					j--;
				}

			}
		}
		return palindr;
	}

	public static void empiler(int n, ArrayList<Integer> listInt)
	{
		if(listInt.size() <= 0)
		{
			listInt.add(n);
		}
		else
		{
			int dernier = listInt.get(listInt.size() - 1);
			listInt.remove(listInt.size() - 1);
			listInt.add(n);
			listInt.add(dernier);
		}


	}

}
