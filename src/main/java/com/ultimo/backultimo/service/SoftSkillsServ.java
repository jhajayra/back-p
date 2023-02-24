package com.ultimo.backultimo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ultimo.backultimo.model.SoftSkills;
import com.ultimo.backultimo.repository.SoftSkillsRepo;


@Service
@Transactional
public class SoftSkillsServ implements ISoftSkillServ {
	
	@Autowired
	private final SoftSkillsRepo softRepo;
	

	public SoftSkillsServ(SoftSkillsRepo softRepo) {
		super();
		this.softRepo = softRepo;
	}

	@Override
	public List<SoftSkills> listaSoft() {
		return softRepo.findAll();
	}

	@Override
	public SoftSkills agregarSoft(SoftSkills skillSoft) {
		return softRepo.save(skillSoft);
	}

	@Override
	public SoftSkills editarSoft(SoftSkills skillSoft) {
		return softRepo.save(skillSoft);
	}

	@Override
	public void borrarSoft(Long id) {
		softRepo.deleteById(id);
	}

	@Override
	public SoftSkills buscarSoft(Long id) {
		return softRepo.findById(id).orElse(null);
	}

}
