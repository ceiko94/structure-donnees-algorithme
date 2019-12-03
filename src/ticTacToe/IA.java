package ticTacToe;

public class IA extends Joueur 
{
	private String [][] plateauJeu;
	
	
	public IA() 
	{
		super("ordinateur");
	}
	
	public Position jouer(Plateau plateau)
	{
		// Verifie si on gagne
		Position horizontal = this.detecterDeuxSignesIdentiquesHorizontal("O", plateau);
		Position vertical = this.detecterDeuxSignesIdentiquesVertical("O", plateau);
		Position diagonal = this.detecterDeuxSignesIdentiquesDiagonal("O", plateau); 
		Position placerJetonGagant = (horizontal != null) ? horizontal : (vertical != null) ? vertical : (diagonal != null) ? diagonal : null;
		
		//Empecher le joueur de gagner si on n'a pas la possibilité de gagner
		if(placerJetonGagant != null)
			return placerJetonGagant;
		
		Position horizontal2 = this.detecterDeuxSignesIdentiquesHorizontal("X", plateau);
		Position vertical2 = this.detecterDeuxSignesIdentiquesVertical("X", plateau);
		Position diagonal2 = this.detecterDeuxSignesIdentiquesDiagonal("X", plateau); 
		Position placerJetonEviterPerdre = (horizontal2 != null) ? horizontal2 : (vertical2 != null) ? vertical2 : (diagonal2 != null) ? diagonal2 : null;
		
		if(placerJetonEviterPerdre != null)
			return placerJetonEviterPerdre;
		
		// On choisit une case au hasard		
		return this.positionHasard(plateau);
		
		
		//Position placerJeton = (horizontal != null) ? horizontal : (vertical != null) ? vertical : (diagonal != null) ? diagonal : this.positionHasard(plateau); 	
		
	}
	
	private Position positionHasard(Plateau plateau)
	{
		plateauJeu = plateau.getTableau();
		int max = plateauJeu[0].length;
		int y = 0;
		int x = 0;
		while(y < max)
		{
			while(x < max)
			{
				if(plateauJeu[y][x].equals("7"))
					return new Position(x,y);

				x++;
			}
			x=0;
			y++;
		}
		
		return null;		
	}
	
	
	private Position detecterDeuxSignesIdentiquesHorizontal(String symbole, Plateau plateau)
	{
		plateauJeu = plateau.getTableau();
		int max = plateauJeu[0].length;
		int x = 0;
		int y = -1;
		while(x < max && y == -1)
		{
			y = (symbole.equals(plateauJeu[x][0]) && plateauJeu[x][0].equals(plateauJeu[x][1])) ? 2 :
				(symbole.equals(plateauJeu[x][0]) && plateauJeu[x][0].equals(plateauJeu[x][2])) ? 1 :
				(symbole.equals(plateauJeu[x][1]) && plateauJeu[x][1].equals(plateauJeu[x][2]))	? 0 : -1;
			
			if(y == -1)
				x++;			
		}
		
		if(x < max && !plateau.caseDejaOccupee(new Position(y,x)))
			return new Position(y,x);
		
		return null;
		
		
		
	}
	
	private Position detecterDeuxSignesIdentiquesVertical(String symbole, Plateau plateau)
	{
		plateauJeu = plateau.getTableau();
		int max = plateauJeu[0].length;
		int x = -1;
		int y = 0;
		while(y < max && x == -1)
		{
			x = (symbole.equals(plateauJeu[0][y]) && plateauJeu[0][y].equals(plateauJeu[1][y])) ? 2 :
				(symbole.equals(plateauJeu[0][y]) && plateauJeu[0][y].equals(plateauJeu[2][y])) ? 1 :
				(symbole.equals(plateauJeu[1][y]) && plateauJeu[1][y].equals(plateauJeu[2][y]))	? 0 : -1;
			
			if(x == -1)
				y++;			
		}
		
		if(y < max && !plateau.caseDejaOccupee(new Position(y,x)))
			return new Position(y,x);
		
		return null;
		
	}
	
	public Position detecterDeuxSignesIdentiquesDiagonal(String symbole, Plateau plateau)
	{
		plateauJeu = plateau.getTableau();
		int max = plateauJeu[0].length;
		
		if(plateauJeu[0][0].equals(symbole) && plateauJeu[1][1].equals(symbole) && !plateau.caseDejaOccupee(new Position(2,2)) )
			return new Position(2,2);
		
		if(plateauJeu[0][0].equals(symbole) && plateauJeu[2][2].equals(symbole) && !plateau.caseDejaOccupee(new Position(1,1)))
			return new Position(1,1);
		
		if(plateauJeu[2][2].equals(symbole) && plateauJeu[1][1].equals(symbole) && !plateau.caseDejaOccupee(new Position(0,0)))
			return new Position(0,0);
		
		if(plateauJeu[2][0].equals(symbole) && plateauJeu[1][1].equals(symbole) && !plateau.caseDejaOccupee(new Position(2,0)))
			return new Position(2,0);
		
		if(plateauJeu[0][2].equals(symbole) && plateauJeu[1][1].equals(symbole) && !plateau.caseDejaOccupee(new Position(0,2)))
			return new Position(0,2);
		
		if(plateauJeu[0][2].equals(symbole) && plateauJeu[2][0].equals(symbole) && !plateau.caseDejaOccupee(new Position(1,1)))
			return new Position(1,1);		
		
		return null;
		
	}
	

}
