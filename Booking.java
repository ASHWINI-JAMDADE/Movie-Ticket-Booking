package com.java.movieticketbooking;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Booking {
    @Id
    private int id; // Assume this is auto-generated or set up as needed
    @ManyToOne
    private User user;
    private int cinemaId;
    private int seatNumber;
    private int movieId;

    // Constructor
    public Booking(User user, int cinemaId, int seatNumber, int movieId) {
        this.user = user;
        this.cinemaId = cinemaId;
        this.seatNumber = seatNumber;
        this.movieId = movieId;
    }

    // Getters and Setters
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(int cinemaId) {
        this.cinemaId = cinemaId;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
}
