package OneToMany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchSimMobile {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("suvendu"); 
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select s from Sim s");
		Query p=em.createQuery("select m from Mobile m");
	    List<Mobile>m=p.getResultList();
		List<Sim>sims=q.getResultList(); 
		for(Sim s:sims) {
			System.out.println(s.getSid());
			System.out.println(s.getName());
			System.out.println(s.getType());
		}  
		for(Mobile mobile:m) {
			System.out.println(mobile.getMid()); 
			System.out.println(mobile.getName()); 
			System.out.println(mobile.getSim());
		}
		
	}

}
