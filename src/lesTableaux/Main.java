package lesTableaux;

import utilitaires.*;

public class Main {

	public static void main(String[] args) {
		
		Exercices ex = new Exercices();
		//ex.afficherDeuxSommes2(OperationsTableau.getTableauPredefini());
		
		int [] tab = OperationsTableau.genererTableauEntiers(20000, 10);
		int [] tab2 = tab;
		int [] tab3 = tab;
		System.out.println("***************************** TABLEAU NON TRIE *********************************");
		OperationsTableau.afficheTableauEntiers(tab);
		System.out.println();
		/*		
		System.out.println("***************************** METHODE LONGUE *********************************");
		Chronometre chr1 = new Chronometre();
		ex.afficherDeuxSommes(tab);
		double tps1 = chr1.tempsEcoule();
		System.out.println("***************************** METHODE COURTE ********************************");
		Chronometre chr2 = new Chronometre();		
		ex.afficherDeuxSommes2(tab);
		double tps2 = chr2.tempsEcoule();
		System.out.println("***************************** TEMPS *******************************");
		System.out.println("Temps execution méthode longue : " + tps1 + " millisecondes");
		System.out.println("Temps execution méthode courte : " + tps2 + " millisecondes");*/
		
		
		System.out.println("***************************** TABLEAU TRI PAR INSERTION *********************************");
		Chronometre chr3 = new Chronometre();
		Tri.triParInsertion(tab);
		OperationsTableau.afficheTableauEntiers(tab);
		System.out.println("Temps execution : " + chr3.tempsEcoule() + " millisecondes\n");
		
		System.out.println("***************************** TABLEAU TRI PAR COMPTAGE  *********************************");
		Chronometre chr4 = new Chronometre();
		Tri.triParComptage(tab2);
		OperationsTableau.afficheTableauEntiers(tab2);
		System.out.println("Temps execution : " + chr4.tempsEcoule() + " millisecondes\n")
		;
		System.out.println("\n***************************** TEMPS *********************************");
		System.out.println("TRI PAR INSERTION : " + chr3.tempsEcoule());
		System.out.println("TRI PAR COMPTAGE : " + chr4.tempsEcoule());

	}

}
