package br.com.codes.domain.type;

/**
 * ENUM itens de sub menu
 *
 */
public enum ItemSubMenu {

	SOBRE("Administração", "Sobre","/pages/sobre.xhtml?faces-redirect=true"), 
	USUARIO("Usuário", "Usuario","/pages/usuario/usuario.xhtml?faces-redirect=true");

	private String modulo;
	private String item;
	private String url;
	
	/**
	 * Acesso aos itens de submenu
	 * @param modulo - Nome do Módulo
	 * @param item - Item do Módulo
	 * @param url - path do arquivo redirect
	 */
	private ItemSubMenu(String modulo, String item,String url) {
		this.modulo = modulo;
		this.item = item;
		this.url = url;
	}

	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
	

}
