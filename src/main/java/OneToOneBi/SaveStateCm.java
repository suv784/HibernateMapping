package OneToOneBi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveStateCm {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("suvendu"); 
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction(); 
		State s=new State();
		s.setName("odisha");
		s.setNo(1); 
		
		CheifMinister cheifMinister=new CheifMinister();
		cheifMinister.setName("Naveen"); 
		cheifMinister.setAge(70); 
		cheifMinister.setQuali("phd"); 
		
		
		s.setCheifMinister(cheifMinister);
		cheifMinister.setState(s);
		et.begin(); 
		em.persist(s);
		em.persist(cheifMinister); 
		et.commit();
		
		
	}

}
