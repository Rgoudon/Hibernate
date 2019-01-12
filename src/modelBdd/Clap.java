package modelBdd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;

@Entity(name = "Clap")
public class Clap {
	
	@Id
	@Column(name = "Id_clap", nullable = false, length = 255)
	private Integer code;
	@Column(name = "duree", nullable = false, length = 255)
	private Integer duree;
	@Column(name = "Code_bobine", nullable = false, length = 255)
	private Integer codeBobine;
	

	public Clap() {
		// TODO Auto-generated constructor stub
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Integer getCodeBobine() {
		return codeBobine;
	}

	public void setCodeBobine(Integer codeBobine) {
		this.codeBobine = codeBobine;
	}

}
