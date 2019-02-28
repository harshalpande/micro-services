package in.javabrains.movieinfoservice.resource;

public class Movie {
	
	private String movieId;
	private String description;
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}
	
	public Movie(String movieId, String description) {
		super();
		this.movieId = movieId;
		this.setDescription(description);
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
