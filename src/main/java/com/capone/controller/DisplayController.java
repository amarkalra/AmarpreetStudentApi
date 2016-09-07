package com.capone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayController {

	@RequestMapping(value = "/UploadCSV")
	public String uploadCSV(Model model) {
		return "UploadPage";
	}
	
	@RequestMapping(value = "/")
	public String index(Model model) {
		return "index";
	}
	
}
