package es.uc3m.tiw.dominios;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

//import es.uc3m.tiw.dominios.Cliente;


@Entity
@Table(name="MENSAJES")
public class Mensaje implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	@Column(nullable = false, length = 300)
    private String mensaje;
	/*@OneToOne
    private Cliente from;
    @OneToOne
    private Cliente to;*/
    
    public Mensaje(Long id, String mensaje) {
		super();
		this.id = id;
		this.mensaje = mensaje;
	}
    
    public Mensaje() {
		super();
	}
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
