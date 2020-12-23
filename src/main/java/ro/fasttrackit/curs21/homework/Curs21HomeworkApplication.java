package ro.fasttrackit.curs21.homework;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fasttrackit.curs21.homework.model.Movie;
import ro.fasttrackit.curs21.homework.model.Type;
import ro.fasttrackit.curs21.homework.web.MovieRepository;

import java.util.List;

@SpringBootApplication
public class Curs21HomeworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(Curs21HomeworkApplication.class, args);
	}


	@Bean
	CommandLineRunner atStartup(MovieRepository repo){
		return args -> repo.saveAll(List.of(
				new Movie("Tenet", Type.SCIFI, 2020),
				new Movie("Joker", Type.ACTION, 2019),
				new Movie("The Godfather", Type.DRAMA, 1972),
				new Movie("Titanic", Type.DRAMA, 1997)
		));
	}
}
