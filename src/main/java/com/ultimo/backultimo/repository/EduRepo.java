package com.ultimo.backultimo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ultimo.backultimo.model.Educacion;


@Repository
public interface EduRepo extends JpaRepository <Educacion, Long>{

}
