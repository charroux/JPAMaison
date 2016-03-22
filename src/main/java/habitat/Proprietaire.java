package habitat;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Proprietaire {

	int id;
	Collection<Logement> logements = new ArrayList<Logement>();

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}
	
	public void addLogement(Logement logement){
		this.getLogements().add(logement);
		logement.setProprietaire(this);
	}

	public void setId(int id) {
		this.id = id;
	}

	@OneToMany(mappedBy="proprietaire")
	public Collection<Logement> getLogements() {
		return logements;
	}

	public void setLogements(Collection<Logement> logements) {
		this.logements = logements;
	}
	
}
