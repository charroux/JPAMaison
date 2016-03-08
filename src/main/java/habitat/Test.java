package habitat;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("ok");
		Maison maison = new Maison(5, 102);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");
		EntityManager entityManager = emf.createEntityManager();
		
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		
		entityManager.persist(maison);
		
		tx.commit();
		
		int key = maison.getKey();
		Maison m =  entityManager.find(habitat.Maison.class, key) ;
		List<Maison> liste = entityManager.createQuery( "SELECT m FROM Maison m WHERE m.nbPieces LIKE '5'").getResultList();
		for (Maison m1: liste){
					System.out.println(m1.getSuperficie()) ;
		}


	}

}
