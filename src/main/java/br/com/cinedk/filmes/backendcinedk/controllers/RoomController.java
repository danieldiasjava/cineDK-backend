package br.com.cinedk.filmes.backendcinedk.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cinedk.filmes.backendcinedk.domain.Room;
import br.com.cinedk.filmes.backendcinedk.services.RoomService;

@RestController
@RequestMapping(value = "/rooms")
public class RoomController {
	@Autowired
	private RoomService service;

	@GetMapping
	public ResponseEntity<List<Room>> findAll() {
		List<Room> list = service.findAll();
		return ResponseEntity.ok().body(list);

	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Room> findById(@PathVariable Long id) {
		Room obj = service.findById(id);
		return ResponseEntity.ok().body(obj);

	}
	
	@PostMapping
	public ResponseEntity<Room> insert(@RequestBody Room objRoom){
		objRoom = service.insert(objRoom);
		return ResponseEntity.ok().body(objRoom);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
		
	}

}
