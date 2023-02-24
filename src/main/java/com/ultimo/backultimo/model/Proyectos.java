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
public class Proyectos implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProye;
	

	@Column(length = 50, unique = true)
    private String nombreProye;
	

	@Column(length = 500)
    private  String descriProye;
	
	@Column(length = 4)
    private int anioProye;

	@ManyToOne
    @JoinColumn(name = "id_usuario",referencedColumnName = "idPer")
    private Usuario usuario;

	public Proyectos() {
		super();
	}

	public Proyectos(Long idProye, String nombreProye, String descriProye, int anioProye,
			com.ultimo.backultimo.model.Usuario usuario) {
		super();
		this.idProye = idProye;
		this.nombreProye = nombreProye;
		this.descriProye = descriProye;
		this.anioProye = anioProye;
		this.usuario = usuario;
	}

	public Proyectos(String nombreProye, String descriProye, int anioProye,
			com.ultimo.backultimo.model.Usuario usuario) {
		super();
		this.nombreProye = nombreProye;
		this.descriProye = descriProye;
		this.anioProye = anioProye;
		this.usuario = usuario;
	}

	public Long getIdProye() {
		return idProye;
	}

	public void setIdProye(Long idProye) {
		this.idProye = idProye;
	}

	public String getNombreProye() {
		return nombreProye;
	}

	public void setNombreProye(String nombreProye) {
		this.nombreProye = nombreProye;
	}

	public String getDescriProye() {
		return descriProye;
	}

	public void setDescriProye(String descriProye) {
		this.descriProye = descriProye;
	}

	public int getAnioProye() {
		return anioProye;
	}

	public void setAnioProye(int anioProye) {
		this.anioProye = anioProye;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
	
}
