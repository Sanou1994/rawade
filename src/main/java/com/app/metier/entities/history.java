package com.app.metier.entities;

public class history {
	private int id;
	private String date ;
	public history() {
		super();
	}
	public history(int id, String date) {
		super();
		this.id = id;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	

}
