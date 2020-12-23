package ro.fasttrackit.curs21.homework.web;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.curs21.homework.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
