package com.java.movieticketbooking;

	import javax.persistence.*;

	@Entity
	@Table(name = "payment")
	public class Payment {
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private double totalPrice;
	    private String paymentOption;
	    private String ticketNumber;
	    private double gst;

	    @ManyToOne
	    @JoinColumn(name = "cinema_hall_id")
	    private CinemaHall cinemaHall;

	    @ManyToOne
	    @JoinColumn(name = "user_id")
	    private User user;

	    private String date;

	    public Payment() {}

	    public Payment(double totalPrice, String paymentOption, String ticketNumber, double gst, CinemaHall cinemaHall, User user, String date) {
	        this.totalPrice = totalPrice;
	        this.paymentOption = paymentOption;
	        this.ticketNumber = ticketNumber;
	        this.gst = gst;
	        this.cinemaHall = cinemaHall;
	        this.user = user;
	        this.date = date;
	    }

	    // Getters and Setter

	    public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public double getTotalPrice() {
			return totalPrice;
		}

		public void setTotalPrice(double totalPrice) {
			this.totalPrice = totalPrice;
		}

		public String getPaymentOption() {
			return paymentOption;
		}

		public void setPaymentOption(String paymentOption) {
			this.paymentOption = paymentOption;
		}

		public String getTicketNumber() {
			return ticketNumber;
		}

		public void setTicketNumber(String ticketNumber) {
			this.ticketNumber = ticketNumber;
		}

		public double getGst() {
			return gst;
		}

		public void setGst(double gst) {
			this.gst = gst;
		}

		public CinemaHall getCinemaHall() {
			return cinemaHall;
		}

		public void setCinemaHall(CinemaHall cinemaHall) {
			this.cinemaHall = cinemaHall;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

	
	    
	}



