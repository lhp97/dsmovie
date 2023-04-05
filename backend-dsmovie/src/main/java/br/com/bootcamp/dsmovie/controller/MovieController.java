package br.com.bootcamp.dsmovie.controller;

import br.com.bootcamp.dsmovie.dto.MovieDTO;
import br.com.bootcamp.dsmovie.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public ResponseEntity<Page<MovieDTO>> findAllPaged(Pageable pageable) {
        Page<MovieDTO> moviesPaged = movieService.findAllPaged(pageable);
        return ResponseEntity.ok().body(moviesPaged);
    }
}
