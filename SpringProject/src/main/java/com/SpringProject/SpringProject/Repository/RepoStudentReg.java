package com.SpringProject.SpringProject.Repository;

import com.SpringProject.SpringProject.Module.Stud_Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface RepoStudentReg extends JpaRepository<Stud_Register,Integer> {
}
