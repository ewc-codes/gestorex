package br.com.codes.dao;

import java.io.Serializable;

import br.com.codes.dto.UsuarioDTO;


public class UsuarioDAO extends GenericDAO<UsuarioDTO, Long> {

	public UsuarioDAO(Class persistentClass) {
		super(persistentClass);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(UsuarioDTO entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UsuarioDTO findById(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	
	
}
