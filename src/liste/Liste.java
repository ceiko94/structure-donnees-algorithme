package liste;

public interface Liste<T extends Comparable> {
	boolean vide();
	Liste<T> ajout(T o);
	Liste<T> queue();
	T tete();
	Liste<T> fusion(Liste<T> l);
	int longueur();
	Liste<T> clone();
	boolean containRecursive(Liste<T> l1, int indexL1);
	Liste<T> concatenationCorrection(Liste<T> l2);
	void affiche();

}
