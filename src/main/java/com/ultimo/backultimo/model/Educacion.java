package com.ultimo.backultimo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Educacion implements Serializable {
	

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEdu;
    
    @Column(length = 50, unique = true)
    private String tituloEdu;
    
 

    @Column(length = 50)
    private String lugarEdu;
    
    @Column(length = 4)
    private int anioEdu;
    
    private String urlEdu;
    
    @ManyToOne
    @JoinColumn(name = "id_usuario",referencedColumnName = "idPer" )
    private Usuario usuario;

	public Educacion() {
		super();
	}

	public Educacion(Long idEdu, String tituloEdu, String lugarEdu, int anioEdu, String urlEdu, Usuario usuario) {
		super();
		this.idEdu = idEdu;
		this.tituloEdu = tituloEdu;
		this.lugarEdu = lugarEdu;
		this.anioEdu = anioEdu;
		this.urlEdu = urlEdu;
		this.usuario = usuario;
	}

	public Educacion(String tituloEdu, String lugarEdu, int anioEdu, String urlEdu, Usuario usuario) {
		super();
		this.tituloEdu = tituloEdu;
		this.lugarEdu = lugarEdu;
		this.anioEdu = anioEdu;
		this.urlEdu = urlEdu;
		this.usuario = usuario;
	}

	public Long getIdEdu() {
		return idEdu;
	}

	public void setIdEdu(Long idEdu) {
		this.idEdu = idEdu;
	}

	public String getTituloEdu() {
		return tituloEdu;
	}

	public void setTituloEdu(String tituloEdu) {
		this.tituloEdu = tituloEdu;
	}

	public String getLugarEdu() {
		return lugarEdu;
	}

	public void setLugarEdu(String lugarEdu) {
		this.lugarEdu = lugarEdu;
	}

	public int getAnioEdu() {
		return anioEdu;
	}

	public void setAnioEdu(int anioEdu) {
		this.anioEdu = anioEdu;
	}

	public String getUrlEdu() {
		return urlEdu;
	}

	public void setUrlEdu(String urlEdu) {
		this.urlEdu = urlEdu;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

    

}
