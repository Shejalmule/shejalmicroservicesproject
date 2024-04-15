package com.school.SchoolService.schoolcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.SchoolService.entity.School;
import com.school.SchoolService.schoolservice.SchoolService;

@RestController
@RequestMapping("/school")
public class SchoolController {
	
	@Autowired
    SchoolService ss;
	
	@PostMapping("/addSchool")
	String addSchool(@RequestBody  School s)
	{
		int rec = ss.addSchool(s);
		if(rec==1)
		{
			return "object saved successfully";
		}
		else
		{
			return "object not saved successfully";
		}		
	}
	
	@GetMapping("/getSchool/{id}")
	 School getSchool(@PathVariable("id") int schoolId)
	 {
		School res = ss.getSchool(schoolId);
		return res;
		 
	 }

	@GetMapping("/getAllSchool")
	List<School> getAllSchool()
	{
		return ss.getAllSchool();
		
	}
	
	@DeleteMapping("/deleteSchool/{id}")
	int deleteSchool(@PathVariable("id") int schoolId)
	{
		return ss.deleteSchool(schoolId);
		
	}
	
	@GetMapping("/getAllStudentList")
	void getAllStudent()
	{
		ss.getAllStudent();
	}
	
	@GetMapping("/getSchoolByStudent/{id}")
	 School getSchoolByStudent(@PathVariable("id") int schoolId)
	 {
		School res = ss.getSchoolByStudent(schoolId);
		return res;
		 
	 }
}
