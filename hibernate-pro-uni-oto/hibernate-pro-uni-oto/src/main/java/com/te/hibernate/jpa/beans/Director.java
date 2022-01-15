package com.te.hibernate.jpa.beans;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="director")
public class Director implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="director_id")
	private int directorId;
	
    @Column(name="director_name")
	private String directorName;
    
    @Column(name="movie_name")
	private String movieName;
	
	public Director() {
		super();
	}

	public Director(int directorId, String directorName, String movieName) {
		super();
		this.directorId = directorId;
		this.directorName = directorName;
		this.movieName = movieName;
	}

	public int getDirectorId() {
		return directorId;
	}

	public void setDirectorId(int directorId) {
		this.directorId = directorId;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	@OneToOne(cascade=CascadeType.ALL)
	private Movie movie;

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	
	
	
	
}
