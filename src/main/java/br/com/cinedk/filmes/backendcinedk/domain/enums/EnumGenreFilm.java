package br.com.cinedk.filmes.backendcinedk.domain.enums;

public enum EnumGenreFilm {

	ACAO(1), AVENTURA(2), SUSPENSE(3), COMEDIA(4), DRAMA(5);

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
