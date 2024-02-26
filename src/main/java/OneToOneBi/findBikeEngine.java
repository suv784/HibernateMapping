package OneToOneBi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class findBikeEngine {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("suvendu"); 
		EntityManager emEntityManager=emf.createEntityManager();  
		
	Bike bike=	emEntityManager.find(Bike.class,2); 
	int id=bike.getBikeId(); 
	String bikeName=bike.getBikeName(); 
	double bikePrice=bike.getBikePrice();  
	Engine engine=bike.getEngine();
    int engineId=engine.getEngineId(); 
	String engineCompany=engine.getEngineCompany();  
	double cc=engine.getCc();
	System.out.println("----------Bike----------------------"); 
	System.out.println(id); 
	System.out.println(bikeName); 
	System.out.println(bikePrice); 
	System.out.println("-------Engine-------------------------");
	System.out.println(engineId); 
	System.out.println(engineCompany); 
	System.out.println(cc);
	
		
		
	}

}
