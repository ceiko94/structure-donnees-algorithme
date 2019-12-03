package exercicesFile;

import java.util.ArrayList;

public class MainFile {

	public static void main(String[] args) 
	{
		int [] n = new int[20];
		for(int i = 0; i < 20; i++)
		{
			n[i] = ((i+7)*2+3);
		}
		
		
		for(int nombre : n)
		{
			System.out.println(nombre + " test");
		}

	}

}
