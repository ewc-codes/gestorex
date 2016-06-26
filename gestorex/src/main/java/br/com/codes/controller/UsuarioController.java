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

import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

import br.com.codes.domain.sentinela.Usuario;
import br.com.codes.dto.UsuarioDTO;
import br.com.codes.service.UsuarioService;

/**
 * @author Michael
 *
 */
@ManagedBean
@RequestScoped
public class UsuarioController implements Controller {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3872700997020841652L;

	private UsuarioDTO usuarioDTO;
	
	private UsuarioService usuarioService;
	
	private List<Usuario> listaUsuario;
	
	private Usuario usuarioSelecionado;
	
	/**
	 * 
	 */
	public UsuarioController() {
		this.usuarioDTO = new UsuarioDTO();
		this.usuarioService = new UsuarioService();
		this.obterListaUsuarios();
	}
	
	
	 @PostConstruct
	 public void init() {
		System.out.println("aki"); 
	 }


	/**
	 * Retorna Lista de usuários cadastrados no sistema.
	 */
	private void obterListaUsuarios() {
		
		listaUsuario = new ArrayList<Usuario>();
		
		listaUsuario = usuarioService.obterListaUsuariosAtivos();
		
	}


	@Override
	public void novo(ActionEvent actionEvent) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void salvar(ActionEvent actionEvent) {
		getUsuarioService().salvar(usuarioDTO);
		
	}


	@Override
	public void filtrar(ActionEvent actionEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exportar(ActionEvent actionEvent) {
		// TODO Auto-generated method stub
		
	}


	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}


	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}


	public UsuarioService getUsuarioService() {
		return usuarioService;
	}


	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}


	public List<Usuario> getListaUsuario() {
		return listaUsuario;
	}


	public void setListaUsuario(List<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}


	public Usuario getUsuarioSelecionado() {
		return usuarioSelecionado;
	}


	public void setUsuarioSelecionado(Usuario usuarioSelecionado) {
		this.usuarioSelecionado = usuarioSelecionado;
	}
	
	
	public void onRowSelect(SelectEvent event) {        
        System.out.println("Selecionou ");
    }
	
	public void onRowUnselect(UnselectEvent event) {
		System.out.println("descelecionou ");
	}
	

}
