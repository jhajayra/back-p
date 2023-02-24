package com.ultimo.backultimo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ultimo.backultimo.model.Skills;



@Repository
public interface SkillsRepo extends JpaRepository < Skills, Long >{

}
