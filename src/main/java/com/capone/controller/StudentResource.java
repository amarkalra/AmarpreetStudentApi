package com.capone.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.capone.domain.Student;
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

	@RequestMapping(value = "/", produces = "application/json")
	Student index(Model model) {
		model.addAttribute("product", "dgshgdsh");
		Student a = new Student();
		a.setFirstName("Amarpreet");

		return new Student();
	}

	@RequestMapping("/uploadStudentForm")
	public String displayUploadPage() {
		return "UploadPage";
	}

	@RequestMapping(value = "/uploadStudents", method = RequestMethod.POST)
	public String handleFileUpload(
			@RequestParam("fileUpload") MultipartFile file) {

		ArrayList<Student> studentList = CSVParserUtil.parserStudentCSV(file);

		studentService.saveStudents(studentList);

		return "file successfully uploaded";
	}

	@RequestMapping(value = "/getStudent/id/{id}", produces = "application/json")
	public Student getStudentById(@PathVariable Integer id) {

		Student std = studentService.getStudentById(id);
		return std;
	}
}
