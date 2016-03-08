package habitat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
class Maison{
	int nbPieces;
	float superficie ;
	int key ;

	public Maison(){
		super();
	}
	
	public Maison(int nbPieces, float superficie){
		this.nbPieces  = nbPieces ;
		this.superficie = superficie;
	}
	
	public int getNbPieces(){
		return nbPieces ;
	}
	
	public void setNbPieces(int nbPieces){
			this.nbPieces  = nbPieces ;
	}
	
	public float getSuperficie (){
			return superficie;
	}
	
	public void setSuperficie(float superficie){
			this. superficie = superficie;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getKey  (){
			return key  ;
	}
	
	public void setKey(int key){
			this.key   = key  ;
	}
}
