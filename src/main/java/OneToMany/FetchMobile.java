package OneToMany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchMobile { 
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("suvendu"); 
		EntityManager em=emf.createEntityManager(); 
		Query q=em.createQuery("select m from Mobile m");  
		List<Mobile>mobile=q.getResultList();
		for(Mobile m:mobile) {
			System.out.println(m.getMid()); 
			System.out.println(m.getName()); 
			System.out.println(m.getSim());
		} 
		System.out.println("----------------------------------"); 
		
		
	}
	

}
