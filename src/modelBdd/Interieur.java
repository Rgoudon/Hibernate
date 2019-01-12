package modelBdd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;

@Entity(name = "interieur")
public class Interieur extends Scene {

	@Column(name = "CodeTheatre", nullable = false, length = 255)
	private Integer codeTheatre;
	
	
	public Interieur() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Integer getCodeTheatre() {
		return codeTheatre;
	}

	public void setCodeTheatre(Integer codeTheatre) {
		this.codeTheatre = codeTheatre;
	}

}
