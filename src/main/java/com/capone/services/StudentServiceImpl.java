package com.capone.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capone.domain.Student;
import com.capone.repositories.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;

	@Autowired
	public void setProductRepository(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public Student getStudentById(Integer id) {

		return studentRepository.findOne(id);

	}

	@Override
	public void saveStudents(ArrayList<Student> students) {

		studentRepository.save(students);
	}

	@Override
	public void saveStudent(Student std) {
	

		studentRepository.save(std);
	}

}
