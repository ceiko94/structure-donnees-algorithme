package black_jack_simplifie;

public enum Figure {
	AS (1),
	DEUX (2),
	TROIS (3),
	QUATRE (4),
	CINQ (5),
	SIX (6),
	SEPT (7),
	HUIT (8),
	NEUF (9),
	DIX (10),
	VALET (10),
	DAME (10),
	ROI (10);
	private int valeur;
	
	Figure (int n) {
		valeur = n;	
	}
	
	public int getValeur() {
		return valeur;
	}
	
	
}
