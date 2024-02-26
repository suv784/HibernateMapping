package OneToOneBi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class findBike {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("suvendu");
		EntityManager em = emf.createEntityManager();
		Bike bike = em.find(Bike.class, 1);
		Engine engine = bike.getEngine();
		engine.setBike(null);
		int id = bike.getBikeId();
		String name = bike.getBikeName();
		double price = bike.getBikePrice();
		System.out.println(id);
		System.out.println(name);
		System.out.println(price);

	}

}
