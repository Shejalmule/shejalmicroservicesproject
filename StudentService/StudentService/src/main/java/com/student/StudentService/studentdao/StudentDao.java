package com.student.StudentService.studentdao;

import java.util.List;

import com.student.StudentService.entity.Student;

public interface StudentDao {

	int addStudent(Student s);
	
	Student getStudent(int stdId);
	
	List<Student> getAllStudent();
	
	int deleteStudent(int stdId);
	
	List<Student> FindBySchoolId(int schoolID);
}
