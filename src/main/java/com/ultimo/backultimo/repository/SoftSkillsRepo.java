package com.ultimo.backultimo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ultimo.backultimo.model.SoftSkills;


@Repository
public interface SoftSkillsRepo extends JpaRepository <SoftSkills, Long> {

}
