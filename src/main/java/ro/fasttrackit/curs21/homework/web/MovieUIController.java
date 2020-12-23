package ro.fasttrackit.curs21.homework.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.fasttrackit.curs21.homework.service.MovieService;

@Controller
@RequestMapping("movies")
public class MovieUIController {
    private final MovieService movieService;

    public MovieUIController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    String getMoviesPage(Model pageModel) {
        pageModel.addAttribute("message", "Add Movie");
        pageModel.addAttribute("movies", movieService.getAll());
        return "movies";
    }
}
