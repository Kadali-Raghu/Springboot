package com.example.demo.services;

public class Hostal {
	private int id;
	private String name;
	private int rent;
	private String location;
	public Hostal(int id, String name, int rent, String location) {
		super();
		this.id = id;
		this.name = name;
		this.rent = rent;
		this.location = location;
	}
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
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Hostal [id=" + id + ", name=" + name + ", rent=" + rent + ", location=" + location + "]";
	}
	

}
