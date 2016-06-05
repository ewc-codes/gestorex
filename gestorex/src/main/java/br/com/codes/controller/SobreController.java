/**
 * 
 */
package br.com.codes.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;

import br.com.codes.dao.SobreDTO;

/**
 * @author Michael
 *
 */

@ManagedBean
@RequestScoped
public class SobreController extends GenericController {

	/**
	 * 
	 */
	private static final long serialVersionUID = 806446800994863378L;
	
	private SobreDTO sobreDTO;

	@PostConstruct
	public void init() {
		this.sobreDTO = new SobreDTO();
		
		System.out.println(getMessage("message.io.login"));
		
	}

	public SobreDTO getSobreDTO() {
		return sobreDTO;
	}

	public void setSobreDTO(SobreDTO sobreDTO) {
		this.sobreDTO = sobreDTO;
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
