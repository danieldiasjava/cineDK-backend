package br.com.cinedk.filmes.backendcinedk.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cinedk.filmes.backendcinedk.domain.Actor;
import br.com.cinedk.filmes.backendcinedk.domain.Movie;
import br.com.cinedk.filmes.backendcinedk.domain.dto.ActorMovieDTO;
import br.com.cinedk.filmes.backendcinedk.repository.ActorRepository;
import br.com.cinedk.filmes.backendcinedk.repository.MovieRepository;
import jakarta.transaction.Transactional;

@Service
public class ActorService {

	@Autowired
	private ActorRepository actorRepository;

	@Autowired
	private MovieRepository movieRepository;

	
	public List<Actor> findAll() {

		return actorRepository.findAll();

	}

	public Actor findById(Long id) {
		Optional<Actor> obj = actorRepository.findById(id);
		return obj.get();
	}

	public Actor insert(Actor obj) {
		return actorRepository.save(obj);
	}

	public void delete(Long id) {
		findById(id);
		actorRepository.deleteById(id);
	}
	
	public Actor update(long id, Actor obj) {
		Actor newActor = actorRepository.getReferenceById(id);
		updateData(newActor, obj);
		return actorRepository.save(newActor);
		
	}

	private void updateData(Actor newActor, Actor obj) {
		newActor.setName(obj.getName());
		newActor.setActorrole(obj.getActorrole());
		
	}

	@Transactional
	public Actor associaAtorFilme(ActorMovieDTO actorMovieDTO) {
		Actor actor = actorRepository.findById(actorMovieDTO.getActorID()).orElseThrow();
		Movie movie = movieRepository.findById(actorMovieDTO.getMovieID()).orElseThrow();
		 
		actor.getMovies().add(movie);
		
		actorRepository.save(actor);
		
		return actor;

	}
}
