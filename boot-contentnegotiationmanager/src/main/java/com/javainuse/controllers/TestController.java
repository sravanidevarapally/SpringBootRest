package com.javainuse.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.Employee;

@RestController
public class TestController {
	
	@RequestMapping("/student.text")
	public String Welcome()
	{
		return "Welcome to Egiants LLC, first step to Success. This is my text. Thank you for visiting ";
	}

	@RequestMapping(value = "/student", method = RequestMethod.GET,
			produces = { "application/json", "application/xml", "text/plain" })
	public Employee firstPage() {

		Employee e = new Employee();
		e.setName("Sravani");
		e.setDesignation("Full Stack Java Developer");
		e.setEmpId("101");
		e.setSalary(99000);

		return e;
	}

}