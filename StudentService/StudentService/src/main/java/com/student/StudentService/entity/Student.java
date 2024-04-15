package com.student.StudentService.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "StudentDetails")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int stdId;
	String stdName;
	int schoolId;
	@Column(name = "deleted",columnDefinition = "varchar(10) default 'N'")
	String deleted;
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public int getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}
	public String getDeleted() {
		return deleted;
	}
	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}
	public Student(int stdId, String stdName, int schoolId, String deleted) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.schoolId = schoolId;
		this.deleted = deleted;
	}
	
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", schoolId=" + schoolId + ", deleted=" + deleted
				+ "]";
	}
	
	
}
