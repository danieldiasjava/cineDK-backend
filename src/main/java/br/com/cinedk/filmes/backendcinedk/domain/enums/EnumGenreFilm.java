package br.com.cinedk.filmes.backendcinedk.domain.enums;

public enum EnumGenreFilm {

	ACAO(0), AVENTURA(1), SUSPENSE(2), COMEDIA(3), DRAMA(4);

	private int code;

	private EnumGenreFilm(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static EnumGenreFilm valueOf(int code) {
		for (EnumGenreFilm value : EnumGenreFilm.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid GenreFilm code");
	}

}
