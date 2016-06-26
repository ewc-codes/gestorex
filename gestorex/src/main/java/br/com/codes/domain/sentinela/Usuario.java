package br.com.codes.domain.sentinela;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_usuario", schema = "sentinela")
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5652262963680479283L;

	@Id
	@SequenceGenerator(name="sq_usuario", sequenceName="sq_usuario", schema="sentinela", allocationSize=1, initialValue=1)
	@GeneratedValue(generator="sq_usuario",strategy=GenerationType.SEQUENCE)
	@Column(name = "usu_id",unique=true)
	private Long usuId;

	@Column(name = "usu_nome", length = 50)
	private String usuNome;

	@Column(name = "usu_login", length = 30)
	private String usuLogin;

	@Column(name = "usu_senha", length = 30)
	private String usuSenha;

	@Column(name = "usu_frase_senha", length = 100)
	private String usuFraseSenha;

	@Column(name = "usu_dt_cadastro")
	private String usuDtCadastro;

	@Column(name = "usu_cad_completo")
	private Boolean usuCadCompleto;

	@Column(name = "usu_conta_free")
	private Boolean usuContaFree;

	@Column(name = "usu_email", length = 50)	
	private String usuEmail;

	@Column(name = "usu_ativo")
	private Boolean usuAtivo;

	public Long getUsuId() {
		return usuId;
	}

	public void setUsuId(Long usuId) {
		this.usuId = usuId;
	}

	public String getUsuNome() {
		return usuNome;
	}

	public void setUsuNome(String usuNome) {
		this.usuNome = usuNome;
	}

	public String getUsuLogin() {
		return usuLogin;
	}

	public void setUsuLogin(String usuLogin) {
		this.usuLogin = usuLogin;
	}

	public String getUsuSenha() {
		return usuSenha;
	}

	public void setUsuSenha(String usuSenha) {
		this.usuSenha = usuSenha;
	}

	public String getUsuFraseSenha() {
		return usuFraseSenha;
	}

	public void setUsuFraseSenha(String usuFraseSenha) {
		this.usuFraseSenha = usuFraseSenha;
	}

	public String getUsuDtCadastro() {
		return usuDtCadastro;
	}

	public void setUsuDtCadastro(String usuDtCadastro) {
		this.usuDtCadastro = usuDtCadastro;
	}

	public Boolean getUsuCadCompleto() {
		return usuCadCompleto;
	}

	public void setUsuCadCompleto(Boolean usuCadCompleto) {
		this.usuCadCompleto = usuCadCompleto;
	}

	public Boolean getUsuContaFree() {
		return usuContaFree;
	}

	public void setUsuContaFree(Boolean usuContaFree) {
		this.usuContaFree = usuContaFree;
	}

	public String getUsuEmail() {
		return usuEmail;
	}

	public void setUsuEmail(String usuEmail) {
		this.usuEmail = usuEmail;
	}

	public Boolean getUsuAtivo() {
		return usuAtivo;
	}

	public void setUsuAtivo(Boolean usuAtivo) {
		this.usuAtivo = usuAtivo;
	}

}
