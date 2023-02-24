package com.ultimo.backultimo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ultimo.backultimo.model.Experiencia;

@Repository
public interface ExpeRepo extends JpaRepository <Experiencia, Long>{

}
