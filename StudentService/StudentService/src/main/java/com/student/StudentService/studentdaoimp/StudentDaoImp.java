package com.student.StudentService.studentdaoimp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.student.StudentService.entity.Student;
import com.student.StudentService.jparepository.StudentJPARepository;
import com.student.StudentService.studentdao.StudentDao;

@Repository
public class StudentDaoImp implements StudentDao {
	
	@Autowired
	StudentJPARepository sr;

	@Override
	public int addStudent(Student s) {
		// TODO Auto-generated method stub
		try {
			sr.save(s);
			return 1;
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
		
	}

	@Override
	public Student getStudent(int stdId) {
		// TODO Auto-generated method stub
		Student t=new Student();
		try {
			t=sr.findById(stdId).orElseThrow();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return t;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		List<Student> s1=new ArrayList<>();
		try {
			s1=sr.findAll();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return s1;
	}

	@Override
	public int deleteStudent(int stdId) {
		// TODO Auto-generated method stub
		Student s2=new Student();
		try {
			s2=sr.findById(stdId).orElseThrow();
			s2.setDeleted("Y");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}

	@Override
	public List<Student> FindBySchoolId(int schoolID) {
		// TODO Auto-generated method stub
		return sr.findBySchoolId(schoolID);
	}

}
