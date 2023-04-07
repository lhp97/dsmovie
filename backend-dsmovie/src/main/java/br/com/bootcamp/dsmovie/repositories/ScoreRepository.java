package br.com.bootcamp.dsmovie.repositories;

import br.com.bootcamp.dsmovie.entities.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends JpaRepository<Score, Long> {
}
