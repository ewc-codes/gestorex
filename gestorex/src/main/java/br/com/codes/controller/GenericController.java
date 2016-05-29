package br.com.codes.controller;

import java.io.IOException;
import java.io.Serializable;

import br.com.codes.util.Props;

public class GenericController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8232781290210831966L;
	

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


}
