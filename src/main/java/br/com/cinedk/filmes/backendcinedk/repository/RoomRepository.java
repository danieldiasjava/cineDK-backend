package br.com.cinedk.filmes.backendcinedk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cinedk.filmes.backendcinedk.domain.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

}
