package ManyToOne;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Platform {
	@Id
	private int id;
	private String name;  
	@OneToMany
	private List<Video> video;
	public List<Video> getVideo() {
		return video;
	}
	public void setVideo(List<Video> videos) {
		this.video = videos;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
