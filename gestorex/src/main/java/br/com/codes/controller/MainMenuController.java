package br.com.codes.controller;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

@ManagedBean
public class MainMenuController {
	
	@PostConstruct
	public void init() {
		System.out.println(" Bean executado! ");
	}
	
	public void saveAction(ActionEvent actionEvent) {
		addMessage("Registro salvo com sucesso");
	}
	
	public void updateAction(ActionEvent actionEvent) {
		addMessage("Registro salvo com sucesso");
	}
	
	public void deleteAction(ActionEvent actionEvent) {
		addMessage("Registro salvo com sucesso");
	}

	public void addMessage(String summary) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Info", summary));
	}

}
