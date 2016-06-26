package br.com.codes.dto;

import java.io.Serializable;

/**
 * @author Michael
 *
 */
public class UsuarioDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3000831578343873523L;

	private String login;

	private String senha;

	private String nome;

	private String frase;

	private String email;
	
	private String confirmarSenha;

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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getConfirmarSenha() {
		return confirmarSenha;
	}

	public void setConfirmarSenha(String confirmarSenha) {
		this.confirmarSenha = confirmarSenha;
	}
	
	

}
