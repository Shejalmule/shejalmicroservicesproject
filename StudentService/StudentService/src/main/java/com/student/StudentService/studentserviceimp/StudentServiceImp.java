package com.student.StudentService.studentserviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.StudentService.entity.Student;
import com.student.StudentService.studentdao.StudentDao;
import com.student.StudentService.studentservice.StudentService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentServiceImp implements StudentService{
	
	@Autowired
	StudentDao sd;

	@Override
	public int addStudent(Student s) {
		// TODO Auto-generated method stub
		return sd.addStudent(s);
	}

	@Override
	public Student getStudent(int stdId) {
		// TODO Auto-generated method stub
		return sd.getStudent(stdId);
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return sd.getAllStudent();
	}

	@Override
	public int deleteStudent(int stdId) {
		// TODO Auto-generated method stub
		return sd.deleteStudent(stdId);
	}

	@Override
	public List<Student> FindBySchoolId(int schoolID) {
		// TODO Auto-generated method stub
		return sd.FindBySchoolId(schoolID);
	}

}
