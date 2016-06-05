package br.com.codes.dto;

import java.io.Serializable;

public class UsuarioDTO implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3000831578343873523L;

	private String login;
	
	private String senha;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	
	

}
