package com.te.studentmanag.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.studentmanag.beans.Student;
import com.te.studentmanag.dao.StudentDao;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao dao;

	@Override
	public boolean registerStudent(Student student) {
		// TODO Auto-generated method stub
		if (student.getEmail() != null && student.getPassword() != null) {
			return dao.registerStudent(student);
		} else {
			return false;
		}

	}

	@Override
	public Student authenicateDetails(int id, String password) {
		// TODO Auto-generated method stub
		if (id < 0) {
			return null;
		} else {
			return dao.authenicateDetails(id, password);
		}
	}

	@Override
	public boolean updateDetails(int id, Student student2) {
		// TODO Auto-generated method stub

		return dao.updateDetails(id, student2);
	}

	@Override
	public boolean addStudent(Student student) {
		// TODO Auto-generated method stub
		return dao.addStudent(student);

	}

	@Override
	public List<Student> seeAllStudent() {
		// TODO Auto-generated method stub
		return dao.seeAllStudent();
	}

	@Override
	public boolean deleteStudent(int id) {
		// TODO Auto-generated method stub
		if (id < 0) {
			return false;
		} else {
			return dao.deleteStudent(id);
		}
	}

}
