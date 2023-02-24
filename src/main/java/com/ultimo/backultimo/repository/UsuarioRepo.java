package com.ultimo.backultimo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ultimo.backultimo.model.Usuario;



@Repository
public interface UsuarioRepo extends JpaRepository < Usuario, Long > {

}
