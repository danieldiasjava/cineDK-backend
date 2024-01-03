package br.com.cinedk.filmes.backendcinedk.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity(name = "tb_ator")
public class Actor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long actorID;
	@Column
	private String name;
	@Column
	private String actorrole;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "FILME_ATOR", 
	joinColumns = @JoinColumn(name = "actor_id"), 
	inverseJoinColumns = @JoinColumn(name = "movie_id"))
	private List<Movie> movies = new ArrayList<>();

	public Actor() {

	}

	@JsonCreator
	public Actor(@JsonProperty Long actorID, String name, String actorrole) {
		super();
		this.actorID = actorID;
		this.name = name;
		this.actorrole = actorrole;
	}

	public Long getActorID() {
		return actorID;
	}

	public void setActorID(Long actorID) {
		this.actorID = actorID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActorrole() {
		return actorrole;
	}

	public void setActorrole(String actorrole) {
		this.actorrole = actorrole;
	}

	@JsonIgnore
	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

	@Override
	public int hashCode() {
		return Objects.hash(actorID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Actor other = (Actor) obj;
		return Objects.equals(actorID, other.actorID);
	}

}
