/**
 * 
 */
package br.com.codes.controller;

import java.io.Serializable;

import javax.faces.event.ActionEvent;


/**
 * @author Michael
 *
 */

public interface Controller extends Serializable {

	
	public void novo(ActionEvent actionEvent);
	
	public void filtrar(ActionEvent actionEvent);
	
	public void exportar(ActionEvent actionEvent);

	void salvar(ActionEvent actionEvent);

	
	
}
