package br.com.cinedk.filmes.backendcinedk.domain.enums;

public enum EnumTypeTicket {

	MEIO_INGRESSO(1), INGRESSO_INTEIRO(2);

	private int code;

	private EnumTypeTicket(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static EnumTypeTicket valueOf(int code) {
		for (EnumTypeTicket value : EnumTypeTicket.values()) {
			if (value.getCode() == code) {
				return value;
			}

		}
		throw new IllegalArgumentException("Invalid TypeTicket code");
	}
}
