package br.com.bootcamp.dsmovie.services;

import br.com.bootcamp.dsmovie.dto.MovieDTO;
import br.com.bootcamp.dsmovie.dto.ScoreDTO;
import br.com.bootcamp.dsmovie.entities.Movie;
import br.com.bootcamp.dsmovie.entities.Score;
import br.com.bootcamp.dsmovie.entities.User;
import br.com.bootcamp.dsmovie.repositories.MovieRepository;
import br.com.bootcamp.dsmovie.repositories.ScoreRepository;
import br.com.bootcamp.dsmovie.repositories.UserRepository;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ScoreService {

    @Autowired
    private ScoreRepository scoreRepository;

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public MovieDTO saveScore(ScoreDTO scoreDTO) {
        val idMovie = scoreDTO.getMovieId();
        val scoreValue = scoreDTO.getScore();

        User user = saveUserIfNewEvaluator(scoreDTO);
        Movie movie = movieRepository.findById(idMovie).get();

        Score score = new Score();
        score.setMovie(movie);
        score.setUser(user);
        score.setValue(scoreValue);

        score = scoreRepository.saveAndFlush(score);

        double sum = 0.0;
        for (Score s: movie.getScores()) {
            sum += s.getValue();
        }

        double avg = sum / movie.getScores().size();

        movie.setScore(avg);
        movie.setCount(movie.getScores().size());

        return new MovieDTO(movieRepository.save(movie));
    }

    public User saveUserIfNewEvaluator(ScoreDTO scoreDTO) {
        val emailUser = scoreDTO.getEmail();
        User user = userRepository.findByEmail(emailUser);

        if (user == null) {
            user = new User();
            user.setEmail(emailUser);
            user = userRepository.saveAndFlush(user);
        }

        return user;
    }

}
