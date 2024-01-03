package br.com.cinedk.filmes.backendcinedk.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cinedk.filmes.backendcinedk.domain.Actor;
import br.com.cinedk.filmes.backendcinedk.domain.dto.ActorMovieDTO;
import br.com.cinedk.filmes.backendcinedk.services.ActorService;

@RestController
@RequestMapping("/api")
public class ConnectActorMovieController {
	
	@Autowired
	private ActorService service;
	
	@PostMapping("/associaAtorFilme")
	public Actor associaAtorFilme(@RequestBody ActorMovieDTO actorMovieDTO ){
		
		return service.associaAtorFilme(actorMovieDTO);
		
		
	}

}
