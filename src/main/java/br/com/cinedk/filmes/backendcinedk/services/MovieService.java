package br.com.cinedk.filmes.backendcinedk.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cinedk.filmes.backendcinedk.domain.Movie;
import br.com.cinedk.filmes.backendcinedk.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;

	public List<Movie> findAll() {

		return movieRepository.findAll();

	}

	public Movie findById(Long id) {
		Optional<Movie> obj = movieRepository.findById(id);
		return obj.get();
	}

	public Movie insert(Movie obj) {
		return movieRepository.save(obj);
		
	}

	public void delete(Long id) {
		findById(id);
		movieRepository.deleteById(id);
	}

}
