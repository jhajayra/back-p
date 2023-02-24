package com.ultimo.backultimo.service;

import java.util.List;

import com.ultimo.backultimo.model.Usuario;


public interface IUsuarioServ {

public Usuario agregarUsuario(Usuario usuario);
    
    public Usuario editarUsuario(Usuario usuario);

    public void borrarUsuario(Long id);

    public Usuario buscarUsuario (Long id);

    public List <Usuario> buscarUsuarioList();
}
