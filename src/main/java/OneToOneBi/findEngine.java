package OneToOneBi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class findEngine {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("suvendu");
		EntityManager emEntityManager = emf.createEntityManager();
		Engine engine = emEntityManager.find(Engine.class, 1);
		Bike bike = engine.getBike();
		bike.setEngine(null);
		int id = engine.getEngineId();
		double cc = engine.getCc();
		String c = engine.getEngineCompany();
		System.out.println(cc);
		System.out.println(id);
		System.out.println(c);

	}

}
