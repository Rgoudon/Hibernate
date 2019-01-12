package modelBdd;

import javax.persistence.*;

@Entity(name = "Setup")
public class Setup {
	
	@Id
	@Column(name = "Id_setup", nullable = false, length = 255)
	private Integer code;
	@Column(name = "Description_setup", nullable = false, length = 255)
	private String texte;

	public Setup() {
		// TODO Auto-generated constructor stub
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}

}
