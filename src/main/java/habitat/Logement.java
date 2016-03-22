package habitat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Logement {

	int key ;
	int nbPieces;
	float superficie;
	Proprietaire proprietaire;
	
	public Logement(){
		super();
	}
	
	public Logement(int nbPieces, float superficie){
		this.nbPieces  = nbPieces ;
		this.superficie = superficie;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getKey  (){
			return key  ;
	}
	
	public void setKey(int key){
			this.key   = key  ;
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

	@ManyToOne
	public Proprietaire getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Proprietaire proprietaire) {
		this.proprietaire = proprietaire;
	}
	
	
}
