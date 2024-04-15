package com.school.SchoolService.schoolldaoimp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.school.SchoolService.entity.School;
import com.school.SchoolService.schooldao.SchoolDao;
import com.school.SchoolService.schooljparepository.SchoolJPARepository;

@Repository
public class SchoolDaoImp implements SchoolDao {

	@Autowired
	SchoolJPARepository sr; 
	
	@Override
	public int addSchool(School s) {
		// TODO Auto-generated method stub
		try
		{
			sr.save(s);
			return 1;
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}

	@Override
	public School getSchool(int schoolId) {
		// TODO Auto-generated method stub
		School s=new School();
		try {
			s=sr.findById(schoolId).orElseThrow();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return s;
	}

	@Override
	public List<School> getAllSchool() {
		// TODO Auto-generated method stub
		List<School> s1=new ArrayList<>();
		try {
			s1=sr.findAll();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return s1;
	}

	@Override
	public int deleteSchool(int schoolId) {
		// TODO Auto-generated method stub
		 School s2=new School();
		 try {
			s2=sr.findById(schoolId).orElseThrow();
			s2.setDeleted("Y");
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}

	

}
