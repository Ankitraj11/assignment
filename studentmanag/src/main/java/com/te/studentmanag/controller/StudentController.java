package com.te.studentmanag.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.te.studentmanag.beans.Student;
import com.te.studentmanag.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService service;

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/add")
	public String addStudent(@SessionAttribute(name = "loggedIn", required = false) Student student) {
		if (student != null) {
			return "addStudent";
		} else {
			return "login";
		}

	}

	@PostMapping("/add")
	public String addStudent(@SessionAttribute(name = "loggedIn", required = false) Student student, Student student1,
			ModelMap map) {
		if (student != null) {
			if (service.addStudent(student1)) {
				map.addAttribute("msg", "student is successfully added");
			} else {
				map.addAttribute("error", "something went wrong");
			}

			return "addStudent";
		} else {
			return "login";
		}
	}

	@PostMapping("/login")
	public String login(int id, String password, ModelMap map, HttpServletRequest request) {
		Student student = service.authenicateDetails(id, password);
		HttpSession session = request.getSession();
		session.setAttribute("loggedIn", student);
		if (student != null) {
			map.addAttribute("data", student);
			return "home";
		} else {
			map.addAttribute("error", "invalid creditential");
			return "login";
		}

	}

	@GetMapping("/update")
	public String updateDetails(@SessionAttribute(name = "loggedIn", required = false) Student student, ModelMap map) {

		if (student != null) {

			map.addAttribute("id", student.getSId());
			return "updateDetails";
		} else {

			return "login";
		}

	}

	@PostMapping("/update")
	public String updatedetails(@SessionAttribute(name = "loggedIn", required = false) Student student,
			Student student2, ModelMap map) {

		if (service.updateDetails(student.getSId(), student2)) {
			map.addAttribute("msg", "details are updated successfully");

		} else {
			map.addAttribute("error", "something went wrong");
		}
		return "updateDetails";

	}

	@GetMapping("/sendToLogin")
	public String registerToLogin() {
		return "login";
	}

	@GetMapping("/register")
	public String register() {
		return "register";
	}

	@PostMapping("/register")
	public String register(Student student, ModelMap map) {
		if (service.registerStudent(student)) {

			map.addAttribute("msg", "your registration is successfull");

		} else {
			map.addAttribute("error", "something went wrong");

		}

		return "register";
	}

	@GetMapping("/showAll")
	public String seeAllDetails(ModelMap map) {

		List<Student> studentList = service.seeAllStudent();
		if (studentList != null) {
			map.addAttribute("details", studentList);

		} else {

			map.addAttribute("errorDetails", "no records found");
		}
		return "showAllStudent";
	}

	@GetMapping("/logOut")
	public String logOut(HttpSession session, ModelMap map) {
		session.invalidate();
		map.addAttribute("msg", "you are logged out successfully");
		return "login";
	}

	@GetMapping("/delete")
	public String deleteStudent(@SessionAttribute(name = "loggedIn", required = false) Student student) {
		if (student != null) {
			return "deleteDetails";
		} else {
			return "login";
		}
	}

	@PostMapping("/delete")
	public String deleteStudent(@SessionAttribute(name = "loggedIn", required = false) Student student, int sId,
			ModelMap map) {
		if (student != null) {
			if (service.deleteStudent(sId)) {
				map.addAttribute("msg", "records deleted successfully");
			} else {
				map.addAttribute("error", "something went wrong");
			}
			return "deleteDetails";

		} else {
			return "login";
		}

	}
}