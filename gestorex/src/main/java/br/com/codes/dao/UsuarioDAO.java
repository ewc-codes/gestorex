package br.com.codes.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import br.com.codes.domain.sentinela.Usuario;
import br.com.codes.dto.UsuarioDTO;


public class UsuarioDAO extends GenericDAO<Usuario, Long> {

	public UsuarioDAO(Class persistentClass) {
		super(persistentClass);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Usuario entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario findById(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Retorna domain de usuario logado pelo login
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public Usuario obterUsuarioLogado(String login, String senha) {
		try {
			Criteria crit = HibernateUtil.getSession().createCriteria(Usuario.class);
			crit.add(Restrictions.eq("usuLogin", login));
			List results = crit.list();
			
			return (Usuario) (results != null ? results.get(0):null);
			
		} catch (Exception e) {
			System.out.println("Ocorreu um erro ao obter usuário "+ e);
		}
		return null;
		
	}
	

	public void salvar(UsuarioDTO usuarioDTO){
		HibernateUtil.getSession().beginTransaction();
		Usuario usuario = preencheUsuario(usuarioDTO);		
		super.save(usuario);
	}

	/**
	 * Preenche objeto usuário.
	 * @param usuarioDTO
	 * @return
	 */
	private Usuario preencheUsuario(UsuarioDTO usuarioDTO) {
		Usuario usuario = new Usuario();
		usuario.setUsuAtivo(true);
		usuario.setUsuLogin(usuarioDTO.getLogin());
		usuario.setUsuSenha(usuarioDTO.getSenha());
		usuario.setUsuNome(usuarioDTO.getNome());
		usuario.setUsuFraseSenha(usuarioDTO.getFrase());
		return usuario;
	}
	
}
