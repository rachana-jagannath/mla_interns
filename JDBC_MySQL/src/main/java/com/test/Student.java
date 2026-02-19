package com.test;

public class Student {
	private int id;
	private String name;
	private String clg;
	private String city;
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
	public String getClg() {
		return clg;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", clg=" + clg + ", city=" + city + "]";
	}
	public void setClg(String clg) {
		this.clg = clg;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}

