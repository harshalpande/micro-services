package in.javabrains.ratingsdataservice.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratings")
public class RatingsResource {

	List<Ratings> ratingsList = Arrays.asList(new Ratings("1234", 4), new Ratings("5678", 5));

	@RequestMapping("/{movieId}")
	public Ratings getMovieRatings(@PathVariable("movieId") String movieId) {
		return ratingsList.stream().filter(ratings -> ratings.getMovieId().equals(movieId)).findFirst().get();
	}

}
