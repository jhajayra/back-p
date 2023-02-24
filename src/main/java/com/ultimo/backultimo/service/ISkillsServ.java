package com.ultimo.backultimo.service;

import java.util.List;

import com.ultimo.backultimo.model.Skills;



public interface ISkillsServ {
	
	public Skills agregarSkill(Skills skill);

    public Skills editarSkill(Skills skill);

    public void borrarSkill (Long id);

    public List <Skills> listaSkill();

    public Skills buscarSkill(Long id);

}
