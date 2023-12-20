package br.com.cinedk.filmes.backendcinedk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cinedk.filmes.backendcinedk.domain.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long>{

}
