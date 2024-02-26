package ManyToOne;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveVideoPlatform { 
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("suvendu"); 
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction(); 
		Platform p1=new Platform();
		p1.setId(101); 
		p1.setName("you tube"); 
		
		/*Platform p2=new Platform();
		p2.setId(202); 
		p2.setName("ULLU"); */
		
		Video video=new Video();
		video.setVid(502); 
		video.setTitle("Learn Java");
		video.setDuration(30); 
		video.setP(p1); 
		
		Video video2=new Video();
		video2.setVid(506); 
		video2.setTitle("Yoga"); 
		video2.setDuration(10); 
		video2.setP(p1); 
		
		Video video3=new Video();
		video3.setVid(507); 
		video3.setTitle("dance"); 
		video3.setDuration(10); 
		video3.setP(p1); 
		
		Video video4=new Video();
		video4.setVid(510); 
		video4.setTitle("music"); 
		video4.setDuration(60); 
		video4.setP(p1);   
		List<Video>videos=new ArrayList<Video>(); 
		videos.add(video); 
		videos.add(video2); 
		videos.add(video3); 
		videos.add(video4); 
		p1.setVideo(videos);
		et.begin();
		em.persist(p1); 
		em.persist(video);
		em.persist(video2); 
		em.persist(video3); 
		em.persist(video4); 
		et.commit();
		
		
	}

}
