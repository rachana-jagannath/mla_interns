package com.test;

public class Movie {
int id;
String m_name;
String hero;
String genres;
public Movie() {
	
}
public Movie(int id,String m_name,String hero,String genres) {
	this.id=id;
	this.m_name=m_name;
	this.hero=hero;
	this.genres=genres;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getM_name() {
	return m_name;
}
public void setM_name(String m_name) {
	this.m_name = m_name;
}
public String getHero() {
	return hero;
}
public void setHero(String hero) {
	this.hero = hero;
}
public String getGenres() {
	return genres;
}
public void setGenres(String genres) {
	this.genres = genres;
}
}
