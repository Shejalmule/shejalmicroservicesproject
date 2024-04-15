package com.student.StudentService.jparepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.StudentService.entity.Student;

public interface StudentJPARepository extends JpaRepository<Student, Integer> {
	
	List<Student> findBySchoolId(int schoolID);

}
