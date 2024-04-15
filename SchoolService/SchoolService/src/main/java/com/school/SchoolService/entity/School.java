package com.school.SchoolService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SchoolDetails")
public class School {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int schoolId;
	String schoolName;
	String deleted;
	public int getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getDeleted() {
		return deleted;
	}
	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}
	public School(int schoolId, String schoolName, String deleted) {
		super();
		this.schoolId = schoolId;
		this.schoolName = schoolName;
		this.deleted = deleted;
	}
	public School() {
		super();
	}
	@Override
	public String toString() {
		return "School [schoolId=" + schoolId + ", schoolName=" + schoolName + ", deleted=" + deleted + "]";
	}
	
	
}
