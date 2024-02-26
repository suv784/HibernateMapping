package OneToOneBi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class State {
	@Id
	private int no;
	private String name;
	@OneToOne
	private CheifMinister cheifMinister;

	public CheifMinister getCheifMinister() {
		return cheifMinister;
	}

	public void setCheifMinister(CheifMinister cheifMinister) {
		this.cheifMinister = cheifMinister;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
