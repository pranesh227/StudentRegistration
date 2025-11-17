package com.SpringProject.SpringProject.Repository;

import com.SpringProject.SpringProject.Module.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoCourse extends JpaRepository <Courses,Integer>{

}
