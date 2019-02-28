package in.javabrains.moviecatalogservice.resource;

public class MovieCatalog {

	private String id;
	private String name;
	private String description;
	private int rating;

	public MovieCatalog() {
		// TODO Auto-generated constructor stub
	}
	
	public MovieCatalog(String id, String name, String description, int rating) {
		super();
		this.id = id;
		this.name = name;
		this.setDescription(description);
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
