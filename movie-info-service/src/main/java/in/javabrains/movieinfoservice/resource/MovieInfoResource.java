package in.javabrains.movieinfoservice.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieInfoResource {

	List<Movie> movieList = Arrays.asList(new Movie("1234", "Movie Description about Movie ID 1234"),
			new Movie("5678", "Movie Description about Movie ID 5678"));

	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
		return movieList.stream().filter(movie -> movie.getMovieId().equals(movieId)).findFirst().get();
	}

}
