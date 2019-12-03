package liste;

import java.util.ArrayList;

public class ListeAuto <T extends Comparable<T>> implements Liste<T>, Cloneable
{
	public class Cell 
	{
		private T val;
		private Cell suiv;
		Cell(){};
		Cell(T v, Cell c)
		{
			val = v;
			suiv = c;
		}
		
		void setVal(T v)
		{
			val = v;
		}
		
		void setSuiv(Cell c)
		{
			suiv = c;
		}
		
		T getVal()
		{
			return val;
		}
		
		Cell getSuiv()
		{
			return suiv;
		}

	}
	
	public static final Liste<?> listeVide = null;
	private Cell top = null;
	public ListeAuto() {}
	private ListeAuto(Cell c)
	{
		top =c;
	}
	
	public boolean vide()
	{
		return top == null;
	}
	
	public Liste<T> ajout(T o)
	{		
		Cell c = new Cell(o, this.top);
		ListeAuto<T> l = new ListeAuto<T>(c);
		return l;
	}
	
	public void affiche()
	{
		if(this.vide())
			System.out.print("-> fin");
		else
		{
			System.out.print(this.tete()+ " -> ");
			this.queue().affiche();
		}
	}
	
	public Liste<T> queue()
	{
		Cell c = top.getSuiv();
		ListeAuto<T> l = new ListeAuto<T>(c);
		return l;
	}
	
	public T tete()
	{
		return top.getVal();
	}
	
	public int longueur()
	{
		Liste<T> l = this;
		if(l.vide())
			return 0;
		else
		{
			l.queue();
			return(1+l.longueur());
		}
	}
	
	public Liste<T> clone()
	{
		Liste<T> l = null;
		return l;
	}
	
	
	public Liste<T> fusion(Liste<T> l) 
	{
		if(l.vide())
			return this;
		else
		{
			if(this.vide())
				return l;
			
			else
			{
				T elementL = l.tete();
				T elementThis = this.tete();
				Liste<T> l2;
				if(elementL.compareTo(elementThis) < 0) // elementL < elementThis
				{
					l2 = this.fusion(l.queue());
					l2.ajout(elementL);					
					
				}
				else
				{
					l2 = this.fusion(l.queue());
					l2.ajout(elementThis);					
				}
				
				return l2;
			}
		}
	}
	
	public boolean containBegin(Liste<T> l1)
	{	
		if(this.longueur() > l1.longueur())
			return false;
		
		if(this.vide())
			return true;
		else
		{
			T elementTeteL1 = l1.tete();
			T elementTeteThis = this.tete();
			
			//if(elementTeteL1.equals(elementTeteThis))
				//return this.queue().containBegin(l1.queue());
			
			return false;			
		}
		
	}
	
	public boolean contain(Liste<T> l)
	{
		return containRecursive(l, 0);
	}
	
	
	public boolean containRecursive(Liste<T> l1, int indexL1)
	{
		int longueurThis = this.longueur();
		int longueurL1 = l1.longueur();

		if(l1.vide() || longueurL1 > longueurThis || this.vide())
			return false;
		else
		{
			if(indexL1 >= longueurL1 || l1.vide())
				return true;
			else
			{
				T teteThis = this.tete();
				T teteL1 = l1.tete();
				return (teteThis.compareTo(teteL1) == 0) ? this.queue().containRecursive(l1.queue(), indexL1 + 1): this.queue().containRecursive(l1.queue(), 0);
			}
			
		}
		
	}
	
	public Liste<T> concatenationCorrection(Liste<T> l2)
	{
		System.out.println("concatenationCorrection");
		Liste<T> lC = new ListeAuto<T>();
		if(this.vide())
			return l2;
		if(l2.vide())
			return this;
		else
		{
			//T ob = this.tete();
			lC = this.queue().concatenationCorrection(l2);
			lC= lC.ajout(this.tete());
			return lC;
		}
	}
	
	
	
	

}
