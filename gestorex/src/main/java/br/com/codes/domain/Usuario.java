package br.com.codes.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_USUARIO",schema="SENTINELA")
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5652262963680479283L;
	
	@Id
	private Long usuId;
	@Column(name="USU_NOME",length=50)
	private String usuNome;

}
