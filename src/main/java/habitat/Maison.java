package habitat;

import javax.persistence.Entity;

@Entity
class Maison extends Logement{
	
	public Maison(){
		super();
	}
	
	public Maison(int nbPieces, float superficie){
		super(nbPieces, superficie);
	}
	
}
