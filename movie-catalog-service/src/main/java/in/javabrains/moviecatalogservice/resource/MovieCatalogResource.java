package in.javabrains.moviecatalogservice.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieCatalogResource {

	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value = "/{userId}")
	public UserMovieInfo getUserMovieInfo(@PathVariable("userId") String userId) {

		List<MovieCatalog> listMovieCatalog = Arrays.asList(new MovieCatalog("1234", "Transformers", "test", 4),
				new MovieCatalog("5678", "Enthiran", "test", 5));

		listMovieCatalog.stream().forEach(movieCatalog -> {

			// Set id and get Description from Movie-Info-WebService
			Movie movie = restTemplate.getForObject("http://MOVIE-INFO-SERVICE/movies/" + movieCatalog.getId(),
					Movie.class);
			movieCatalog.setDescription(movie.getDescription());

			// Set id and get Ratings from Ratings-Data-WebService
			Ratings ratings = restTemplate.getForObject("http://RATINGS-DATA-SERVICE/ratings/" + movieCatalog.getId(),
					Ratings.class);
			movieCatalog.setRating(ratings.getRatings());
			
		});

		UserMovieInfo userMovieInfo = new UserMovieInfo();
		userMovieInfo.setListMovieCatalog(listMovieCatalog);
		userMovieInfo.setName("Harshal Pande");
		userMovieInfo.setUserId(userId);
		return userMovieInfo;
	}

}
