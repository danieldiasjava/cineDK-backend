package br.com.cinedk.filmes.backendcinedk.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cinedk.filmes.backendcinedk.domain.Movie;
import br.com.cinedk.filmes.backendcinedk.services.MovieService;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {
	@Autowired
	private MovieService service;

	@GetMapping
	public ResponseEntity<List<Movie>> findAll() {
		List<Movie> list = service.findAll();
		return ResponseEntity.ok().body(list);

	}
	
	@PostMapping
	public ResponseEntity<Movie> insert(@RequestBody Movie objMovie){
		objMovie = service.insert(objMovie);
		return ResponseEntity.ok().body(objMovie);
	}

}
