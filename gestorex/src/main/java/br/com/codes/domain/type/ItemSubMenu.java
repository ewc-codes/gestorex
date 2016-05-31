package br.com.codes.domain.type;

public enum ItemSubMenu {

	SOBRE("Administração", "Sobre");

	private String modulo;
	private String item;

	private ItemSubMenu(String modulo, String item) {
		this.modulo = modulo;
		this.item = item;
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

}
