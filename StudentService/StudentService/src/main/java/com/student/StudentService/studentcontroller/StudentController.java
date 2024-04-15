package com.student.StudentService.studentcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

import com.student.StudentService.entity.Student;
import com.student.StudentService.studentservice.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService ss;
	
	@PostMapping("/saveStudent")
	String saveStudent(@RequestBody Student s)
	{
		int rec = ss.addStudent(s); 
		if(rec==1)
		{
			return "object saved successfully";
		}
		else
		{
			return "object not saved";
		}		
	}
	
	@GetMapping("/getStudent/{id}")
	Student getStudent(@PathVariable("id") int stdId)
	{
		Student res = ss.getStudent(stdId);
		return res;		
	}
	
	@GetMapping("/getAllStudent")
	List<Student> getAllStudent()
	{		
		return ss.getAllStudent();		
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	int deleteStudent(@PathVariable("id") int stdId)
	{
		return ss.deleteStudent(stdId);
		
	}
	
	@GetMapping("/getStudentBySchool/{id}")
	List<Student> getStudentBySchool(@PathVariable("id") int schoolId)
	{
		return ss.FindBySchoolId(schoolId);		
	}

}
