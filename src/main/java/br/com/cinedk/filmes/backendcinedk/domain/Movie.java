package br.com.cinedk.filmes.backendcinedk.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.cinedk.filmes.backendcinedk.domain.enums.EnumGenreFilm;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity(name = "tb_filme")
public class Movie implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long movieId;
	@Column
	private String title;
	@Column
	private Integer duration;

	@Column
	private Integer enumGenreFilm;

	@ManyToMany(mappedBy = "movies")
	private List<Actor> actors = new ArrayList<>();

	@ManyToMany
	private List<Ticket> tickets = new ArrayList<>();

	@Column
	private Actor actor;

	public Movie() {

	}

	@JsonCreator
	public Movie(@JsonProperty Long movieId, String title, Integer duration,
			@JsonProperty EnumGenreFilm enumGenreFilm) {
		super();
		this.movieId = movieId;
		this.title = title;
		this.duration = duration;
		setGenreFilm(enumGenreFilm);

	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public EnumGenreFilm getGenreFilm() {
		return EnumGenreFilm.valueOf(enumGenreFilm);
	}

	public void setGenreFilm(EnumGenreFilm enumGenreFilm) {
		if (enumGenreFilm != null) {
			this.enumGenreFilm = enumGenreFilm.getCode();
		}
	}

	public List<Actor> getActor() {
		return actors;
	}

	public void setActor(List<Actor> actors) {
		this.actors = actors;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	@Override
	public int hashCode() {
		return Objects.hash(movieId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		return Objects.equals(movieId, other.movieId);
	}

}
