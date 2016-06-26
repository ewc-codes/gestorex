package br.com.codes.service;

import java.util.ArrayList;
import java.util.List;

import br.com.codes.dao.UsuarioDAO;
import br.com.codes.domain.sentinela.Usuario;
import br.com.codes.dto.UsuarioDTO;


public class UsuarioService {
	
	private UsuarioDAO usuarioDao;
	private Usuario usuarioLogado;
	
	private static final String  USUARIO_ATIVO = "usuAtivo";

	public UsuarioDAO getUsuarioDao() {
		return usuarioDao == null ? new UsuarioDAO(Usuario.class) : usuarioDao;
	}

	public void setUsuarioDao(UsuarioDAO usuarioDao) {
		this.usuarioDao = usuarioDao;
	}
	
	/**
	 * Obtem usuario com informação de login e senha
	 * @param login
	 * @param senha
	 */
	private void obterUsuarioLogado(String login,String senha){
		this.usuarioLogado = getUsuarioDao().obterUsuarioLogado(login, senha);
	}
	
	
	public void salvar(UsuarioDTO usuarioDto){
		getUsuarioDao().salvar(usuarioDto);
	}
	
	
	/**
	 * Verifica se senha informado é correta
	 * @param login
	 * @param senha
	 * @return
	 */
	public Boolean obterAcessoSistema(String login, String senha) {
		
		this.obterUsuarioLogado(login, senha);
		return this.usuarioLogado != null ? this.usuarioLogado.getUsuSenha().equals(senha) : false;
	}

	public Usuario getUsuarioLogado() {
		return usuarioLogado;
	}

	public void setUsuarioLogado(Usuario usuarioLogado) {
		this.usuarioLogado = usuarioLogado;
	}

	/**
	 * Retotna lista de usuários ativos no sistema.
	 * @return Lista de Usuários ativos
	 */
	@SuppressWarnings("unused")
	public List<Usuario> obterListaUsuariosAtivos() {
		
		try {
			List<Usuario> listaUsuarios = new ArrayList<Usuario>();
			
			listaUsuarios = getUsuarioDao().findAllActives(Usuario.class.getDeclaredField(USUARIO_ATIVO));
			
			return listaUsuarios;
			
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		
		
		return null;
		
	}
	
	
	
	
	
	

}
