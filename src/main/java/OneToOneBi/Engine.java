package OneToOneBi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Engine {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int engineId;
	private String engineCompany; 
	private double cc; 
	@OneToOne
	private Bike bike;
	public int getEngineId() {
		return engineId;
	}
	public void setEngineId(int engineId) {
		this.engineId = engineId;
	}
	public String getEngineCompany() {
		return engineCompany;
	}
	public void setEngineCompany(String engineCompany) {
		this.engineCompany = engineCompany;
	}
	public double getCc() {
		return cc;
	}
	public void setCc(double cc) {
		this.cc = cc;
	}
	public Bike getBike() {
		return bike;
	}
	public void setBike(Bike bike) {
		this.bike = bike;
	}
	

}
