package br.com.bootcamp.dsmovie.services;

import br.com.bootcamp.dsmovie.dto.MovieDTO;
import br.com.bootcamp.dsmovie.entities.Movie;
import br.com.bootcamp.dsmovie.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Transactional
    public Page<MovieDTO> findAllPaged(Pageable pageable) {
        Page<Movie> movies = movieRepository.findAll(pageable);
        return movies.map(x -> new MovieDTO(x));
    }
}
