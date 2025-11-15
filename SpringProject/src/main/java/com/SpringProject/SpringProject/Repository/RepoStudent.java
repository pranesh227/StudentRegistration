package com.SpringProject.SpringProject.Repository;

import com.SpringProject.SpringProject.Module.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoStudent extends JpaRepository <Student,Integer>{

}
