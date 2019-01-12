package modelBdd;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity(name = "Film")
public class Film {

	@Id
	@Column(name = "Id_lieu", nullable = false, length = 255)
	private Integer id;
	@Column(name = "titre", nullable = false, length = 255)
	private String titre;
	
	public Film() {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

}
