package com.te.studentmanag.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "student")
public class Student implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sId;

	@Column(name = "s_name")
	private String name;

	@Column(name = "s_email")
	private String email;

	@Column(name = "s_password")
	private String password;

}
