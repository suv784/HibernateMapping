package OneToOneBi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteBikeEngine { 
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("suvendu"); 
		EntityManager emEntityManager=emf.createEntityManager();
		EntityTransaction etEntityTransaction=emEntityManager.getTransaction();
	    Bike bike=emEntityManager.find(Bike.class, 1);   
	    Engine engine=  bike.getEngine();
	    etEntityTransaction.begin();  
	    emEntityManager.remove(bike);
	    emEntityManager.remove(engine);
	    emEntityManager.close();
	    
	    
	 
		
		
	}

}
