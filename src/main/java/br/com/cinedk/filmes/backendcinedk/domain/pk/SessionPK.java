
package br.com.cinedk.filmes.backendcinedk.domain.pk;

import java.io.Serializable;
import java.util.Objects;

import br.com.cinedk.filmes.backendcinedk.domain.Movie;
import br.com.cinedk.filmes.backendcinedk.domain.Ticket;
import jakarta.persistence.Embeddable;

@Embeddable
public class SessionPK implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private Movie movie;
	
	private Ticket ticket;

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	@Override
	public int hashCode() {
		return Objects.hash(movie, ticket);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SessionPK other = (SessionPK) obj;
		return Objects.equals(movie, other.movie) && Objects.equals(ticket, other.ticket);
	}

}
