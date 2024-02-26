package OneToMany;

import java.util.ArrayList; 
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveMobileSim { 
	public static void main(String[] args) { 
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("suvendu"); 
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();  
		Mobile m=new Mobile();
		m.setMid(1); 
		m.setName("galxy5G"); 
	  
		Sim s1=new Sim();
		s1.setSid(1);  
		s1.setName("jio");  
		s1.setType("4G");  
		s1.setMobile(m);
		
		Sim s2=new Sim();
		s2.setSid(2); 
		s1.setName("airtel"); 
		s1.setType("5G"); 
		s1.setMobile(m); 
		
		Sim s3=new Sim(); 
		s3.setSid(3); 
		s3.setName("vodafone"); 
		s3.setType("5G"); 
		s3.setMobile(m);   
		
		List<Sim>sims=new ArrayList<Sim>();  
		sims.add(s1);
		sims.add(s2);  
		sims.add(s3); 
		m.setSim(sims);
		et.begin();
		em.persist(m); 
		em.persist(s1); 
		em.persist(s2); 
		et.commit();
		
	}

}
