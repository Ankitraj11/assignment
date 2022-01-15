package com.te.hibernate.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernate.jpa.beans.Director;
import com.te.hibernate.jpa.beans.Movie;

public class App {

	
	public static void main(String[] args) {
		   
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("DirectorUnit01");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
	 	Director director=new Director();
		
	      director.setDirectorName("Rohit setty");
	      director.setMovieName("singham");
	      
	    Movie movie=new Movie();
	    movie.setMovieName("singham");
	    movie.setActor("Ajay Devgan");
	    director.setMovie(movie);
	    
	 	entityTransaction.begin();
		
	     	
	     	entityManager.merge(director);
		entityTransaction.commit();
		
		
	}
}
