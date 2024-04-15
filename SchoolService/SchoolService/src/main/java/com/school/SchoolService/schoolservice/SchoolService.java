package com.school.SchoolService.schoolservice;

import java.util.List;

import com.school.SchoolService.entity.School;

public interface SchoolService {
	
	int addSchool(School s);
	
	School getSchool(int schoolId);
	
	List<School> getAllSchool();
	
	int deleteSchool(int schoolId);
	
	void getAllStudent();
	
	School getSchoolByStudent(int schoolId);
	
}
