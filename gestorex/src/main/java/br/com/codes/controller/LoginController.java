package br.com.codes.controller;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import br.com.codes.dto.UsuarioDTO;

@ManagedBean
@RequestScoped
public class LoginController extends GenericController{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4895493245014341642L;
		
	private UsuarioDTO usuarioDTO;

	
	@PostConstruct
	public void init() {
		usuarioDTO = new UsuarioDTO();
		System.out.println(getMessage("message.io.login"));
		
	}
		
	
	public void saveAction(ActionEvent actionEvent) {
		addMessage("Registro salvo com sucesso");
	}

	public void addMessage(String summary) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Info", summary));
	}
	
	public String accessAction(){
		return "/home.xhtml?faces-redirect=true";
	}
	
	
	public void recoveryPasswordAction(ActionEvent actionEvent){
		
	}
	
	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}


	@Override
	public void novo(ActionEvent actionEvent) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void filtrar(ActionEvent actionEvent) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void exportar(ActionEvent actionEvent) {
		// TODO Auto-generated method stub
		
	}


	

	
}
