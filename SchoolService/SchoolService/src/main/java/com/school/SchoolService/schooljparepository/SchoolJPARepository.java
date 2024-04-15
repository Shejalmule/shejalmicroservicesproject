package com.school.SchoolService.schooljparepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.school.SchoolService.entity.School;

@Component
public interface SchoolJPARepository extends JpaRepository<School, Integer>{

}
