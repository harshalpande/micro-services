package in.javabrains.moviecatalogservice.resource;

import java.util.ArrayList;
import java.util.List;

public class UserMovieInfo {

	private String userId;

	private String name;

	private List<MovieCatalog> listMovieCatalog = new ArrayList<>();
	
	public UserMovieInfo() {
		// TODO Auto-generated constructor stub
	}
	
	public UserMovieInfo(String userId, String name, List<MovieCatalog> listMovieCatalog) {
		super();
		this.userId = userId;
		this.name = name;
		this.listMovieCatalog = listMovieCatalog;
	}



	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<MovieCatalog> getListMovieCatalog() {
		return listMovieCatalog;
	}

	public void setListMovieCatalog(List<MovieCatalog> listMovieCatalog) {
		this.listMovieCatalog = listMovieCatalog;
	}
}
