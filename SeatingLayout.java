package com.java.movieticketbooking;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SeatingLayout {
    @Id
    private int seatNumber;
    private double price;

    @ManyToOne
    private CinemaHall cinemaHall; // Assuming there’s a relationship with CinemaHall

    // Constructors, Getters, and Setters
    public SeatingLayout() {}

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CinemaHall getCinemaHall() {
        return cinemaHall;
    }

    public void setCinemaHall(CinemaHall cinemaHall) {
        this.cinemaHall = cinemaHall;
    }
}
