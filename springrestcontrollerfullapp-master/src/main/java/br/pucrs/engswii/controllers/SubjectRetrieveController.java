package br.pucrs.engswii.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.RequestBody;

import br.pucrs.engswii.beans.*;

@RestController
public class SubjectRetrieveController {

	//	@RequestMapping(method = RequestMethod.GET, value="/student/allstudent")
	//
	//	@ResponseBody
	@GetMapping("/subject/allsubject")
	public List<Subject> getAllSubjects() {
		return SubjectRegistration.getInstance().getSubjectRecords();
	}
}
