package OneToOneBi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindStateCM {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("suvendu");
		EntityManager em = emf.createEntityManager(); 
		State state = em.find(State.class, 1);
		int no = state.getNo();
		String name = state.getName();
		int number = state.getNo();
		CheifMinister cheifMinister = state.getCheifMinister();
		String cmName = cheifMinister.getName();
		int cmAge = cheifMinister.getAge();
		String cmQuali = cheifMinister.getQuali();
		System.out.println("-------state----------");
		System.out.println(name);
		System.out.println(number);
		System.out.println("-------minster-----------");
		System.out.println(cmName);
		System.out.println(cmAge);
		System.out.println(cmQuali); 

	}

}
