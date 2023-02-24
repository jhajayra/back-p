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
public class Skills implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSkill;
	

	@Column(length = 30, unique = true)
    private String nombreSkill;


	@Column(length = 3)
    private int porcentaje;

	@ManyToOne
    @JoinColumn(name = "id_usuario",referencedColumnName = "idPer")
    private Usuario usuario;

	public Skills() {
		super();
	}

	public Skills(Long idSkill, String nombreSkill, int porcentaje, Usuario usuario) {
		super();
		this.idSkill = idSkill;
		this.nombreSkill = nombreSkill;
		this.porcentaje = porcentaje;
		this.usuario = usuario;
	}

	public Skills(String nombreSkill, int porcentaje, Usuario usuario) {
		super();
		this.nombreSkill = nombreSkill;
		this.porcentaje = porcentaje;
		this.usuario = usuario;
	}

	public Long getIdSkill() {
		return idSkill;
	}

	public void setIdSkill(Long idSkill) {
		this.idSkill = idSkill;
	}

	public String getNombreSkill() {
		return nombreSkill;
	}

	public void setNombreSkill(String nombreSkill) {
		this.nombreSkill = nombreSkill;
	}

	public int getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
