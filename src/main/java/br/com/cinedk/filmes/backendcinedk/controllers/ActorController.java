package br.com.cinedk.filmes.backendcinedk.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cinedk.filmes.backendcinedk.domain.Actor;
import br.com.cinedk.filmes.backendcinedk.services.ActorService;

@RestController
@RequestMapping(value = "/actors")
public class ActorController {
	@Autowired
	private ActorService service;

	@GetMapping
	public ResponseEntity<List<Actor>> findAll() {
		List<Actor> list = service.findAll();
		return ResponseEntity.ok().body(list);

	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Actor> findById(@PathVariable Long id) {
		Actor obj = service.findById(id);
		return ResponseEntity.ok().body(obj);

	}
	
	@PostMapping
	public ResponseEntity<Actor> insert(@RequestBody Actor objActor){
		objActor = service.insert(objActor);
		return ResponseEntity.ok().body(objActor);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Actor> update(@PathVariable long id, @RequestBody Actor obj){
		obj = service.update(id, obj);
		return ResponseEntity.ok().body(obj);
	}

}
