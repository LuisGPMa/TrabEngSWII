package br.pucrs.engswii.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engswii.beans.EnrolledStudents;
import br.pucrs.engswii.beans.Student;
import br.pucrs.engswii.beans.StudentRegistration;
import br.pucrs.engswii.beans.Subject;
import br.pucrs.engswii.beans.SubjectRegistration;

@RestController
public class StudentEnrollmentRetrieveController {
    
    //	@RequestMapping(method = RequestMethod.GET, value="/student/allstudent")
    //
    //	@ResponseBody
    @GetMapping("/subject/allstudent")
    public List<Student> getStudentsInSubject(
    @RequestParam(value = "subjectCode") String subjectCode, 
    @RequestParam(value = "subjectSchedule") String subjectSchedule) {
        Subject sbj = SubjectRegistration.getInstance().getSubject(subjectCode, subjectSchedule);    
        return EnrolledStudents.getInstance().getEnrolledStudents(sbj);
    }

}
