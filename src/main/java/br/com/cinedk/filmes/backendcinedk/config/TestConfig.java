/*
package br.com.cinedk.filmes.backendcinedk.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.cinedk.filmes.backendcinedk.domain.Actor;
import br.com.cinedk.filmes.backendcinedk.domain.Movie;
import br.com.cinedk.filmes.backendcinedk.domain.enums.EnumGenreFilm;
import br.com.cinedk.filmes.backendcinedk.repository.ActorRepository;
import br.com.cinedk.filmes.backendcinedk.repository.MovieRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private ActorRepository actorRepository;
	@Autowired
	private MovieRepository movieRepository;
	
	@Override
	public void run(String... args) throws Exception{
		Actor ator1 = new Actor(null, "Sylvester Stallone", "Rambo", null);
		Actor ator2 = new Actor(null, "Brad Pitt", "Gerry Lane", null);
		Actor ator3 = new Actor(null, "Daniel Craig", "James Bond", null);
		
		Movie filme1 =   new Movie(null, "Rambo - Programado para Matar", 120,  EnumGenreFilm.ACAO, ator1);
		Movie filme2 =   new Movie(null, "Gerra Mundial Z", 120,  EnumGenreFilm.SUSPENSE, ator2);
		Movie filme3 =   new Movie(null, "007 - Cassino Royale", 120,  EnumGenreFilm.ACAO, ator3);
		
		actorRepository.saveAll(Arrays.asList(ator1,ator2,ator3));
		movieRepository.saveAll(Arrays.asList(filme1,filme2, filme3));
		
		
	}

}
*/