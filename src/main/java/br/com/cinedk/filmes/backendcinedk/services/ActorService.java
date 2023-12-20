package br.com.cinedk.filmes.backendcinedk.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cinedk.filmes.backendcinedk.domain.Actor;
import br.com.cinedk.filmes.backendcinedk.repository.ActorRepository;

@Service
public class ActorService {

	@Autowired
	private ActorRepository actorRepository;

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

}
