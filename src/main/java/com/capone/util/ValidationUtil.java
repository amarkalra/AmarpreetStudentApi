package com.capone.util;

import org.springframework.web.multipart.MultipartFile;

import com.capone.exceptionhandler.InvalidFileException;

public class ValidationUtil {

	public void validateFile(MultipartFile file) throws InvalidFileException {

		if (file.isEmpty()) {
			throw new InvalidFileException("File Size is zero");
		}

		if (!file.getContentType().equals("application/csv")) {
			throw new InvalidFileException("Invalid File Type, "
					+ "Service accepts only CSV" + "file ");

		}

	}

	public void validateStudentJsonRequest(MultipartFile file) throws InvalidFileException {

		if (file.isEmpty()) {
			throw new InvalidFileException("File Size is zero");
		}

		if (!file.getContentType().equals("application/csv")) {
			throw new InvalidFileException("Invalid File Type, "
					+ "Service accepts only CSV" + "file ");

		}

	}

}
