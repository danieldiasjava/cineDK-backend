package br.com.cinedk.filmes.backendcinedk.domain.dto;

public class ActorMovieDTO {

	
	private Long actorID;

	
	private Long movieID;
	
	public ActorMovieDTO() {
		
	}

	public ActorMovieDTO(Long actorID, Long movieID) {
		super();
		this.actorID = actorID;
		this.movieID = movieID;
	}

	public Long getActorID() {
		return actorID;
	}

	public void setActorID(Long actorID) {
		this.actorID = actorID;
	}

	public Long getMovieID() {
		return movieID;
	}

	public void setMovieID(Long movieID) {
		this.movieID = movieID;
	}



}