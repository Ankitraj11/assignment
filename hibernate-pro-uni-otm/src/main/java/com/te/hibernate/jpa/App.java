package com.te.hibernate.jpa;

import java.util.ArrayList;
import java.util.List;

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
	      
	     Movie movie1=new Movie();
	     movie1.setActor("Aaamir Khan");
	     movie1.setMovieName("singham");
	     
	     Movie movie2=new Movie();
	     movie2.setActor("Salman Khan");
	     movie2.setMovieName("3 idiots");
	     
	     Movie movie3=new Movie();
	     movie3.setActor("Shakurh Khan");
	     movie3.setMovieName("ddlj");
	     
	     
	     
	      List<Movie> movieList=new ArrayList<Movie>();
	     
	     
	     movieList.add(movie1);
	     movieList.add(movie2);
	     movieList.add(movie3);
	     director.setMovieList(movieList); 
	   
	    
	 	entityTransaction.begin();
		
	     	
	     	entityManager.persist(director);
		entityTransaction.commit();
		
		
	}
}
