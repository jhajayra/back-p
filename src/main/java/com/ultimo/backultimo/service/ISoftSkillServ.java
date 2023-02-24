package com.ultimo.backultimo.service;

import java.util.List;

import com.ultimo.backultimo.model.SoftSkills;



public interface ISoftSkillServ {

public List <SoftSkills> listaSoft();
	
	public SoftSkills agregarSoft(SoftSkills skillSoft);
	
	public SoftSkills editarSoft(SoftSkills skillSoft);
	
	public void borrarSoft(Long id);
	
	public SoftSkills buscarSoft(Long id);
	
}
