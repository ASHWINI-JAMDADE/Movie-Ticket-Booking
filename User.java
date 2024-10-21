package com.java.movieticketbooking;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int age;
    private String location;
    private String language;
    private String interest;
   
	private int typeofcustomer;

    // Constructors
    public User() {}

    public User(String name, int age, String location, String language, String interest) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.language = language;
        this.interest = interest;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }
    public int getTypeofcustomer() {
		return typeofcustomer;
	}

	public void setTypeofcustomer(int typeofcustomer) {
		this.typeofcustomer = typeofcustomer;
	}

}
