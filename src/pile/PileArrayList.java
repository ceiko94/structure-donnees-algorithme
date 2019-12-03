package pile;
import java.util.*;

public class PileArrayList<T> implements Pile<T> {

	private int top=-1;
	private ArrayList<T> tabPile;
	
	public PileArrayList() 
	{
		tabPile = new ArrayList<T>();
	}
	
	public boolean vide()
	{
		return top == -1;
	}
	
	public void empiler(T o)
	{
		tabPile.add(o);
		top++;
	}
	
	public void depiler()
	{
		tabPile.remove(top);
		top--;
	}
	
	public T sommet()
	{
		return tabPile.get(top);
	}
	
	private T getElement(int index)
	{
		return tabPile.get(index);
	}
	
	/*Exercice 5 : Ecrire un algorithme et une méthode qui inverse une pile en utilisant uniquement les fonctionnalités des piles*/
	public PileArrayList<T> inverserPile()
	{
		// Modification de la pile de la classe this
		PileArrayList<T> nouvellePile = new PileArrayList<T>();
		
		for(int i = top; i > -1; i--)
		{
			nouvellePile.empiler(this.getElement(i));
		}
		
		
		return nouvellePile;
	}


}
