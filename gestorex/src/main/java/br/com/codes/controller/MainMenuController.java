package br.com.codes.controller;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import br.com.codes.domain.type.ItemSubMenu;



@ManagedBean
@RequestScoped
public class MainMenuController extends GenericController{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2121549074188321758L;
	
	private String itemMenu;

	@PostConstruct
	public void init() {
		System.out.println(" Bean - Menu - executado! ");
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
	
	public void acessarItensMenu(ActionEvent actionEvent){		
		
		String item = getStringParameter("item");
		
		if(item.equals(ItemSubMenu.SOBRE.getItem())){
			setItemMenu("/pages/sobre.xhtml");			
		}		
	}

	public String quitAction(){
		return "/index.xhtml?faces-redirect=true";
	}

	public String getItemMenu() {
		return itemMenu;
	}

	public void setItemMenu(String itemMenu) {
		this.itemMenu = itemMenu;
	}
	
	
}
