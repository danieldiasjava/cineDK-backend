package br.com.cinedk.filmes.backendcinedk.domain.enums;

public enum EnumCategoryTicket {
	
	INGRESSO_FISICO(1),
	INGRESSO_ONLINE(2);

	private int code;
	
	private EnumCategoryTicket(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}
	
	public static EnumCategoryTicket valueOf(int code) {
		for (EnumCategoryTicket value : EnumCategoryTicket.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid CategoryTicket code");
	}
	
}
