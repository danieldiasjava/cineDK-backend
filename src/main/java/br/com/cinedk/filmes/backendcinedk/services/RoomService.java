package br.com.cinedk.filmes.backendcinedk.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cinedk.filmes.backendcinedk.domain.Room;
import br.com.cinedk.filmes.backendcinedk.repository.RoomRepository;

@Service
public class RoomService {

	@Autowired
	private RoomRepository roomRepository;

	public List<Room> findAll() {

		return roomRepository.findAll();

	}

	public Room findById(Long id) {
		Optional<Room> obj = roomRepository.findById(id);
		return obj.get();
	}

	public Room insert(Room obj) {
		return roomRepository.save(obj);
		
	}

	public void delete(Long id) {
		findById(id);
		roomRepository.deleteById(id);
	}

}
