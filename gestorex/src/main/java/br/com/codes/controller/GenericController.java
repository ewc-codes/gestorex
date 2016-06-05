package br.com.codes.controller;

import java.io.IOException;

import javax.faces.context.FacesContext;

import br.com.codes.util.Props;




public abstract class GenericController implements Controller{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8232781290210831966L;
	
	
	private FacesContext parameter;
	
	public GenericController() {
		super();
	}
	
	/**
	 * Retorna mensagens catalogadas no message.properties
	 * @param key - Chave do arquivo
	 * @return Texto da propriedade
	 */
	public String getMessage(String key) {
		try {
			return Props.getMessageProps().getString(key);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Retorna Itens de menu catalogadas no menu.properties
	 * @param key - Chave do arquivo
	 * @return Texto da propriedade
	 */
	public String getMenuItem(String key) {
		try {
			return Props.getMenuProperties().getString(key);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Retorna parametro do tipo string
	 * @param key
	 * @return
	 */
	public String getStringParameter(Object key) {
		return (String)parameter.getCurrentInstance().getExternalContext().getRequestParameterMap().get(key);
	}

	
	


}
