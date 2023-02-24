package com.ultimo.backultimo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ultimo.backultimo.model.Usuario;
import com.ultimo.backultimo.repository.UsuarioRepo;


@Service
@Transactional
public class UsuarioServ implements IUsuarioServ{
	
	 @Autowired
	    private final UsuarioRepo usuarioRepo;  
	    
	    public UsuarioServ(UsuarioRepo usuarioRepo) {
		super();
		this.usuarioRepo = usuarioRepo;
	}

		@Override
	    public Usuario agregarUsuario(Usuario usuario) {
	        return usuarioRepo.save(usuario);
	    }
	    
	    @Override
	    public Usuario editarUsuario(Usuario usuario) {
	        return usuarioRepo.save(usuario);
	    }
	    
	    @Override
	    public void borrarUsuario(Long id) {
	        usuarioRepo.deleteById(id);
	    }
	      
	    @Override
	    public Usuario buscarUsuario(Long id) {
	        return usuarioRepo.findById(id).orElse(null);
	    }


	    @Override
	    public List<Usuario> buscarUsuarioList() {
	          return usuarioRepo.findAll();
	    }

}
