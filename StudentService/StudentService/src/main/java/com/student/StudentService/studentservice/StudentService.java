package com.student.StudentService.studentservice;

import java.util.List;

import com.student.StudentService.entity.Student;

public interface StudentService {

int addStudent(Student s);
	
	Student getStudent(int stdId);
	
	List<Student> getAllStudent();
	
	int deleteStudent(int stdId);
	
	List<Student> FindBySchoolId(int schoolID);
}
