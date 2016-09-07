package com.capone.services;

import java.util.ArrayList;

import com.capone.domain.Student;

public interface StudentService {

	Student getStudentById(Integer id);

	void saveStudents(ArrayList<Student> list);
	
	void saveStudent(Student std);
}
