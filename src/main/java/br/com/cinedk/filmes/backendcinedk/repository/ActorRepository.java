package br.com.cinedk.filmes.backendcinedk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.cinedk.filmes.backendcinedk.domain.Actor;
import br.com.cinedk.filmes.backendcinedk.domain.Movie;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Long> {

}
