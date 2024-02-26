package OneToOneBi;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Service {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("suvendu");

	public static boolean saveAdharPerson(Adhar a, Person p) {
		boolean n = false;
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(a);
		em.persist(p);
		et.commit();
		n = true;
		return n;
	}

	public static List<Person> getAdharPerson() {
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("select p from person p");
		List<Person> list = query.getResultList();
		for (Person p : list) {
			System.out.println(p.getId());
			System.out.println(p.getName());
			Adhar adhar=p.getAdhar();
			System.out.println(adhar.getAddr());
			System.out.println(adhar.getAid());
			

		}
		return list;

	}

	public static boolean updatePersonAdhar(int id) {
		boolean f = false;
		EntityManager em = emf.createEntityManager();
		Person person = em.find(Person.class, id); 
		person.setName("Soumya"); 
		Adhar adhar=new Adhar(); 
		adhar.setAddr("bhubaneswar"); 
		person.setAdhar(adhar);
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(person);
		et.commit();
		f = true;
		return f;
	}

	public static boolean deletePersonAdhar(int id) {
		boolean f = false;
		EntityManager em = emf.createEntityManager();
		Person person = em.find(Person.class, id);
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.remove(person);
		et.commit();
		f = true;

		return f; 
	}
}


