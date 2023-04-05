package br.com.bootcamp.dsmovie.repositories;

import br.com.bootcamp.dsmovie.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
