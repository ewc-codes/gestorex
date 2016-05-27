package br.com.codes.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

@ManagedBean
public class LoginController implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4895493245014341642L;
	
	private String login;
	
	private String senha;
	
	@PostConstruct
	public void init() {
		System.out.println(" Bean - Login - executado! ");
	}
	
	public void saveAction(ActionEvent actionEvent) {
		addMessage("Registro salvo com sucesso");
	}

	public void addMessage(String summary) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Info", summary));
	}
	
	public String accessAction(){
		return "home.xhtml?faces-redirect=true";
	}
	
	public void recoveryPasswordAction(ActionEvent actionEvent){
		
	}

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