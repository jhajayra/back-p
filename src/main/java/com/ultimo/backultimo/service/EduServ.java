package com.ultimo.backultimo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ultimo.backultimo.model.Educacion;
import com.ultimo.backultimo.repository.EduRepo;





@Service
@Transactional
public class EduServ implements IEduServ {

	@Autowired
    private final EduRepo educaRepo;

	public EduServ(EduRepo educaRepo) {
		super();
		this.educaRepo = educaRepo;
	}

	@Override
	public Educacion agregarEdu(Educacion educacion) {
		  return educaRepo.save(educacion);
	}

	@Override
	public Educacion editarEdu(Educacion educacion) {
		return educaRepo.save(educacion);

	}

	@Override
	public void borrarEdu(Long id) {
		   educaRepo.deleteById(id);
	}

	@Override
	public List<Educacion> listaEdu() {
		  return educaRepo.findAll();
	}

	@Override
	public Educacion buscarEdu(Long id) {
		 return educaRepo.findById(id).orElse(null);
	}
	
	
	
}
