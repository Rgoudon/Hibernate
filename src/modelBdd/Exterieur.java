package modelBdd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;

@Entity(name = "exterieure")
public class Exterieur extends Scene {

	@Column(name = "CodeLieu", nullable = false, length = 255)
	private Integer codeLieu;
	
	public Exterieur() {
		// TODO Auto-generated constructor stub
	}
	

	public Integer getCodeLieu() {
		return codeLieu;
	}

	public void setCodeLieu(Integer codeLieu) {
		this.codeLieu = codeLieu;
	}

}
