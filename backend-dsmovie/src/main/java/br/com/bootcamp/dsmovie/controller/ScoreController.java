package br.com.bootcamp.dsmovie.controller;

import br.com.bootcamp.dsmovie.dto.MovieDTO;
import br.com.bootcamp.dsmovie.dto.ScoreDTO;
import br.com.bootcamp.dsmovie.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/scores")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @PutMapping
    public MovieDTO save(@RequestBody ScoreDTO scoreDTO) {
        return scoreService.saveS   core(scoreDTO);
    }
}
