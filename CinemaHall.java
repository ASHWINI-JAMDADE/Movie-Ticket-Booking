package com.java.movieticketbooking;

	import javax.persistence.*;
	import java.util.List;

	@Entity
	@Table(name = "cinema_halls")
	public class CinemaHall {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
		private String name;
	    private double rating;
	    private String area; //full address
	    private int seatingCapacity;

	    @ElementCollection
	    private List<String> moviesAndTimings; 

	    public CinemaHall() {}

	    public CinemaHall(String name, double rating, String location, int seatingCapacity, List<String> moviesAndTimings) {
	        this.name = name;
	        this.rating = rating;
	        this.area = location;
	        this.seatingCapacity = seatingCapacity;
	        this.moviesAndTimings = moviesAndTimings;
	    }
	    
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

		public String getLocation() {
			return area;
		}

		public void setLocation(String location) {
			this.area = location;
		}

		public int getSeatingCapacity() {
			return seatingCapacity;
		}

		public void setSeatingCapacity(int seatingCapacity) {
			this.seatingCapacity = seatingCapacity;
		}

		public List<String> getMoviesAndTimings() {
			return moviesAndTimings;
		}

		public void setMoviesAndTimings(List<String> moviesAndTimings) {
			this.moviesAndTimings = moviesAndTimings;
		}

	

	  
	}



