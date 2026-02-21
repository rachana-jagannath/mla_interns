package com.test;

import java.util.List;

public class Employee {
	private int id;
	private String e_namr;
	private List<String> skills;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getE_namr() {
		return e_namr;
	}
	public void setE_namr(String e_namr) {
		this.e_namr = e_namr;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	
}
