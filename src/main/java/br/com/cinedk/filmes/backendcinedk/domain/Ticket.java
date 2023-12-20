
package br.com.cinedk.filmes.backendcinedk.domain;


import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.cinedk.filmes.backendcinedk.domain.enums.EnumCategoryTicket;
import br.com.cinedk.filmes.backendcinedk.domain.enums.EnumTypeTicket;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_ingresso")
public class Ticket implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private EnumTypeTicket typeTicket;
	@Column
	private EnumCategoryTicket categoryTicket;
	
	@OneToOne
	private Movie movies;
	
	@JsonCreator
	public Ticket(@JsonProperty EnumTypeTicket typeTicket,@JsonProperty EnumCategoryTicket categoryTicket, Movie movie) {
		super();
		this.typeTicket = typeTicket;
		this.categoryTicket = categoryTicket;
		this.setMovie(movie);
	}

	public EnumTypeTicket getTypeTicket() {
		return typeTicket;
	}

	public EnumCategoryTicket getCategoryTicket() {
		return categoryTicket;
	}

	public Movie getMovie() {
		return movies;
	}

	public void setMovie(Movie movie) {
		this.movies = movie;
	}

}
