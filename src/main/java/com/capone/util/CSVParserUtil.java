package com.capone.util;

import java.io.InputStreamReader;
import java.util.ArrayList;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.capone.domain.Student;

public class CSVParserUtil {

	public static ArrayList<Student> parserStudentCSV(MultipartFile file) {
		ArrayList<Student> listOfStudents = new ArrayList<Student>();
		try {
			Iterable<CSVRecord> records = CSVFormat.EXCEL.withHeader().parse(
					new InputStreamReader(file.getInputStream()));
			for (CSVRecord record : records) {
				Student std = new Student();
				std.setFirstName(record.get("First Name"));
				std.setLastName(record.get("Last Name"));
				std.setAffiliations(record.get("Affiliations"));
				std.setBirthDate(record.get("BirthDate"));
				std.setLastEnrolled(record.get("LastEnrolled"));
				std.setHireDate(record.get("HireDate"));
				std.setSeparationDate(record.get("SeparationDate"));
				std.setAddress(record.get("Address"));

				
						
				listOfStudents.add(std);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listOfStudents;
	}

}
