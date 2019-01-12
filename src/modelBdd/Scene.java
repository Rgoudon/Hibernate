package modelBdd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Scene {

	@Id
	@Column(name = "Id", nullable = false, length = 255, insertable = false, updatable = false)
	private int id;
	@Column(name = "Description", nullable = false, length = 255, insertable = false, updatable = false)
	private String texte;
	
	public Scene() {
		// TODO Auto-generated constructor stub
	}

	
	public String getTexte() {
		return texte;
	}
	public void setTexte(String texte) {
		this.texte = texte;
	}

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
}
