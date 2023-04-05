package br.com.bootcamp.dsmovie.services;

import br.com.bootcamp.dsmovie.dto.MovieDTO;
import br.com.bootcamp.dsmovie.entities.Movie;
import br.com.bootcamp.dsmovie.repositories.MovieRepository;
import br.com.bootcamp.dsmovie.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Transactional
    public Page<MovieDTO> findAllPaged(Pageable pageable) {
        Page<Movie> movies = movieRepository.findAll(pageable);
        return movies.map(x -> new MovieDTO(x));
    }

    @Transactional
    public MovieDTO findById(Long id) {
        Optional<Movie> movieOptional = movieRepository.findById(id);
        Movie movie = movieOptional.orElseThrow(() -> new ResourceNotFoundException("Filme não encontrado."));
        return new MovieDTO(movie);
    }
}
