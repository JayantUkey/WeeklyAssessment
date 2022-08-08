package com.college.service;

import com.college.dao.StudentDao;
import com.college.model.Student;

public class StudentService {

	public String insert(Student student) {
		StudentDao sdao = new StudentDao();
		return sdao.insert(student);
	}
	
	public void displayAll(Student student) {
		StudentDao sdao = new StudentDao();
		sdao.displayAll(student);
	}
}
