package com.school.SchoolService.schoolserviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.school.SchoolService.entity.School;
import com.school.SchoolService.schooldao.SchoolDao;
import com.school.SchoolService.schoolservice.SchoolService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class SchoolServiceImp implements SchoolService {
	
	@Autowired
	SchoolDao sd;
	
	@Autowired
	RestTemplate rt;

	@Override
	public int addSchool(School s) {
		// TODO Auto-generated method stub
		return sd.addSchool(s);
	}

	@Override
	public School getSchool(int schoolId) {
		// TODO Auto-generated method stub
		return sd.getSchool(schoolId);
	}

	@Override
	public List<School> getAllSchool() {
		// TODO Auto-generated method stub
		return sd.getAllSchool();
	}

	@Override
	public int deleteSchool(int schoolId) {
		// TODO Auto-generated method stub
		return sd.deleteSchool(schoolId);
	}

	@Override
	public void getAllStudent() {
		// TODO Auto-generated method stub
		String res = rt.getForObject("http://localhost:8001/student/getAllStudent", String.class);
		System.out.println(res);
	}
	
	@Override
	public School getSchoolByStudent(int schoolId) {
		// TODO Auto-generated method stub
		String response = rt.getForObject("http://localhost:8001/student/getStudentBySchool/"+schoolId, String.class);
		System.out.println(response);
		return null;
	}



}
