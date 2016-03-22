package habitat;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		
		
		Maison maison1 = new Maison(5, 102);
		Maison maison2 = new Maison(10, 200);
		
		Proprietaire proprietaire = new Proprietaire();
		
		proprietaire.getLogements().add(maison1);
		maison1.setProprietaire(proprietaire);
		
		proprietaire.getLogements().add(maison2);
		maison2.setProprietaire(proprietaire);
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");
		EntityManager entityManager = emf.createEntityManager();
		
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		
		entityManager.persist(maison1);
		entityManager.persist(maison2);
		entityManager.persist(proprietaire);
		
		tx.commit();
		
		int key = maison1.getKey();
		Maison m =  entityManager.find(habitat.Maison.class, key) ;
		
		List<Maison> liste = entityManager.createQuery( "SELECT m FROM Maison m WHERE m.nbPieces LIKE '5'").getResultList();
		for (Maison m1: liste){
					System.out.println(m1.getSuperficie()) ;
		}


	}

}
