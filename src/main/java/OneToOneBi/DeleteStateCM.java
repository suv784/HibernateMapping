package OneToOneBi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteStateCM { 
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("suvendu"); 
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction(); 
	State state=em.find(State.class, 1); 
	CheifMinister cheifMinister=state.getCheifMinister(); 
	et.begin(); 
	em.remove(state);
	em.remove(cheifMinister); 
	et.commit(); 
	
	
		
	}

}
