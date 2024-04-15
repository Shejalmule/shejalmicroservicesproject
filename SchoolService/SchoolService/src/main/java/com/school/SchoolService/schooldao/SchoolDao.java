package com.school.SchoolService.schooldao;

import java.util.List;

import com.school.SchoolService.entity.School;

public interface SchoolDao {

	int addSchool(School s);
	
	School getSchool(int schoolId);
	
	List<School> getAllSchool();
	
	int deleteSchool(int schoolId);
	

	
}
