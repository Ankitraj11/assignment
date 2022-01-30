package com.te.studentmanag.service;

import java.util.List;

import com.te.studentmanag.beans.Student;

public interface StudentService {

	public boolean registerStudent(Student student);

	public Student authenicateDetails(int id, String password);

	public boolean updateDetails(int id, Student student2);

	public boolean addStudent(Student student);

	public List<Student> seeAllStudent();

	public boolean deleteStudent(int id);
}
