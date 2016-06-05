package br.com.codes.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_USUARIO", schema = "SENTINELA")
@SequenceGenerator(name="SQ_USUARIO", sequenceName="SQ_USUARIO", allocationSize=1, initialValue=0)
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5652262963680479283L;

	@Id
	@Column(name = "USU_ID")	
	private Long usuId;

	@Column(name = "USU_NOME", length = 50)
	private String usuNome;

	@Column(name = "USU_LOGIN", length = 30)
	private String usuLogin;

	@Column(name = "USU_SENHA", length = 30)
	private String usuSenha;

	@Column(name = "USU_FRASE_SENHA", length = 100)
	private String usuFraseSenha;

	@Column(name = "USU_DT_CADASTRO")
	private String usuDtCadastro;

	@Column(name = "USU_CAD_COMPLETO")
	private Boolean usuCadCompleto;

	@Column(name = "USU_CONTA_FREE")
	private Boolean usuContaFree;

	@Column(name = "USU_EMAIL", length = 50)
	private String usuEmail;

	@Column(name = "USU_ativo")
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
