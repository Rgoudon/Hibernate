package modelBdd;

import javax.persistence.*;

@Entity(name = "lieu")
public class Lieu {
	
	@Id
	@Column(name = "CodeExterieur", nullable = false, length = 255)
	private Integer codeAir;
	@Column(name = "Endroit", nullable = false, length = 255)
	private String endroit;
	@Column(name = "Description_zone", nullable = false, length = 255)
	private String description;

	public Lieu() {
		// TODO Auto-generated constructor stub
	}

	public Integer getCodeAir() {
		return codeAir;
	}

	public void setCodeAir(Integer codeAir) {
		this.codeAir = codeAir;
	}

	public String getEndroit() {
		return endroit;
	}

	public void setEndroit(String endroit) {
		this.endroit = endroit;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
