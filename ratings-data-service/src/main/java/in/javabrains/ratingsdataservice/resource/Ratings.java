package in.javabrains.ratingsdataservice.resource;

public class Ratings {
	
	private String movieId;
	private Integer ratings;
	
	public Ratings(String movieId, Integer ratings) {
		super();
		this.movieId = movieId;
		this.ratings = ratings;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public Integer getRatings() {
		return ratings;
	}
	public void setRatings(Integer ratings) {
		this.ratings = ratings;
	}
	
}
