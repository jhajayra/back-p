package com.ultimo.backultimo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ultimo.backultimo.model.Proyectos;


@Repository
public interface ProyeRepo extends JpaRepository < Proyectos, Long >{

}
