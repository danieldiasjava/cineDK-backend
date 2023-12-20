
package br.com.cinedk.filmes.backendcinedk.domain;

import java.io.Serializable;
import java.util.Objects;

import br.com.cinedk.filmes.backendcinedk.domain.pk.SessionPK;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name = "tb_sessao")
public class Session implements Serializable{
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SessionPK id;
	@Column
	private Boolean stateofsession;
	@Column
	private Integer hour;
	
	
	public Session() {
		
	}

	public Session(Movie movie,Ticket ticket,Boolean stateofsession, Integer hour) {
		super();
		id.setMovie(movie);
		id.setTicket(ticket);
		this.stateofsession = stateofsession;
		this.hour = hour;
	}
	
	public Movie movie() {
		return id.getMovie();
	}
	
	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}
	
	public Ticket ticket() {
		return id.getTicket();
	}
	
	public void setTicket(Ticket ticket) {
		id.setTicket(ticket);
	}

	public Boolean getStateofsession() {
		return stateofsession;
	}

	public void setStateofsession(Boolean stateofsession) {
		this.stateofsession = stateofsession;
	}

	public Integer getHour() {
		return hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Session other = (Session) obj;
		return Objects.equals(id, other.id);
	}

}
