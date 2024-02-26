package OneToOneBi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveBikeEngine {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("suvendu"); 
		EntityManager emEntityManager=emf.createEntityManager(); 
		EntityTransaction entityTransaction=emEntityManager.getTransaction();  
		Bike bike=new Bike(); 
		bike.setBikeName("splender plus"); 
		bike.setBikePrice(856936);   
		
		Engine engine=new Engine();
		engine.setEngineCompany("Hero");
		engine.setCc(100); 
		bike.setEngine(engine); 
		engine.setBike(bike);  
		entityTransaction.begin(); 
		emEntityManager.persist(bike); 
		emEntityManager.persist(engine);  
		entityTransaction.commit();
		
	
		
		
		
		
	}

}
