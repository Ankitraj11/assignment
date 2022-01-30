package com.te.studentmanag.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;

import org.springframework.stereotype.Repository;

import com.te.studentmanag.beans.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Override
	public boolean registerStudent(Student student) {
		// TODO Auto-generated method stub
		EntityManager manager = null;
		boolean isRegistered = false;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("StudentUnit01");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();

			transaction.begin();
			manager.persist(student);
			transaction.commit();
			isRegistered = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			transaction.rollback();
			e.printStackTrace();
		}

		return isRegistered;
	}

	@Override
	public Student authenicateDetails(int id, String password) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("StudentUnit01");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Student student = manager.find(Student.class, id);
		if (student != null) {
			if (student.getPassword().equals(password)) {
				return student;
			} else {
				return null;
			}
		}
		return null;

	}

	@Override
	public boolean updateDetails(int id, Student student2) {
		// TODO Auto-generated method stub
		boolean isUpdated = false;
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("StudentUnit01");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		Student student = manager.find(Student.class, id);
		if (student != null) {
			student.setEmail(student2.getEmail());
			student.setName(student2.getName());
			student.setPassword(student.getPassword());

			transaction.begin();
			manager.persist(student);
			transaction.commit();
			isUpdated = true;
		}
		return isUpdated;
	}

	@Override
	public boolean addStudent(Student student) {
		// TODO Auto-generated method stub
		EntityTransaction transaction = null;
		boolean isAdded = false;
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("StudentUnit01");
			EntityManager manager = factory.createEntityManager();
			transaction = manager.getTransaction();

			transaction.begin();
			manager.persist(student);
			transaction.commit();
			isAdded = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			transaction.rollback();
			e.printStackTrace();
		}
		return isAdded;

	}

	@Override
	public List<Student> seeAllStudent() {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("StudentUnit01");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		String showAllQuery = "from Student";
		Query query = manager.createQuery(showAllQuery);
		List<Student> studentList = query.getResultList();
		if (studentList != null) {
			return studentList;
		} else {
			return null;
		}

	}

	@Override
	public boolean deleteStudent(int sid) {
		// TODO Auto-generated method stub
		boolean isRemoved = false;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("StudentUnit01");
			EntityManager manager = factory.createEntityManager();
			transaction = manager.getTransaction();

			Student student = manager.find(Student.class, sid);
			if (student != null) {
				transaction.begin();
				manager.remove(student);
				transaction.commit();
				isRemoved = true;
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			transaction.rollback();
			e.printStackTrace();
		}
		return isRemoved;
	}

}
