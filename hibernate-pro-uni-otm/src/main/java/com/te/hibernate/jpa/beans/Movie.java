package com.te.hibernate.jpa.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="movie")

public class Movie implements Serializable { 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
	@Column(name="movie_id")
      private int movieId;
     
     @Column(name="movie_name")
     private String movieName;
     
     @Column(name="actor")
      private String actor;
      
      
     
	public Movie() {
		super();
	}
	public Movie(int movieId, String movieName, String actor) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.actor = actor;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
      
}
