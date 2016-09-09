package com.capone.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.capone.domain.Student;
import com.capone.exceptionhandler.InvalidFileException;
import com.capone.exceptionhandler.RecordNotFoundException;
import com.capone.services.StudentService;
import com.capone.util.CSVParserUtil;

@RestController
@RequestMapping("/student")
public class StudentResource {

	private StudentService studentService;

	@Autowired
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@RequestMapping(value = "/postStudent", method = RequestMethod.POST, consumes = "application/json")
	String saveStudent(@RequestBody Student std) {
		if (std != null) {
			studentService.saveStudent(std);
		}

		return "Student added successfully";
	}

	@RequestMapping("/uploadStudentForm")
	public String displayUploadPage() {
		return "UploadPage";
	}

	@RequestMapping(value = "/uploadStudents", method = RequestMethod.POST)
	public String handleFileUpload(
			@RequestParam("fileUpload") MultipartFile file)
			throws InvalidFileException {
		ArrayList<Student> studentList = CSVParserUtil.parserStudentCSV(file);

		studentService.saveStudents(studentList);

		return "file successfully uploaded";
	}

	@RequestMapping(value = "/getStudent/id/{id}", produces = "application/json")
	public Student getStudentById(@PathVariable Integer id)
			throws RecordNotFoundException {

		Student std = studentService.getStudentById(id);
		if (std == null) {
			throw new RecordNotFoundException("Student doesnt exist in records");
		}
		return std;
	}

}
