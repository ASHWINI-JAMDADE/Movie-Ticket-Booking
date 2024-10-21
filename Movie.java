package com.java.movieticketbooking;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  
    private Long id;
    private String name;
    private double rating;
    private String releaseDate;
   // private String cinemaHall; 
    private String time;
    private String language;
    //catageory

    public Movie() {}
    
    public Movie(String name, double rating, String releaseDate, String cinemaHall, String time, String language) {
        this.name = name;
        this.rating = rating;
        this.releaseDate = releaseDate;
      
        this.time = time;
        this.language = language;
    }

    // Getters and Setters
    
    public Long getId() {
	 return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}


	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	
}



