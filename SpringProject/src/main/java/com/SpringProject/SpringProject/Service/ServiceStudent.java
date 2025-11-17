package com.SpringProject.SpringProject.Service;

import com.SpringProject.SpringProject.Module.Courses;
import com.SpringProject.SpringProject.Module.Stud_Register;
import com.SpringProject.SpringProject.Repository.RepoCourse;
import com.SpringProject.SpringProject.Repository.RepoStudentReg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceStudent {
    @Autowired
    RepoCourse repo;


    @Autowired
    RepoStudentReg repostud;

    //==========================================================Student Registered======================================================================//


    public void studputdet(String name, String email, String course) {
       Stud_Register ss=new Stud_Register(name,email,course);
          repostud.save(ss);
    }

    public List<Stud_Register> servgetstud() {
        return repostud.findAll();
    }



//    public CourseRegistry resstud(CourseRegistry cr) {
//        return regrepo.save(cr);
//    }

//    public List<CourseRegistry> servgetstud() {
//        return regrepo.findAll();
//    }

//    public CourseRegistry updstud(CourseRegistry cr) {
//        return regrepo.save(cr);
//    }

    //==========================================================List The Courses======================================================================//

    public List<Courses> ListStud() {
        return repo.findAll();
    }

    public Courses studdet(Courses st) {
        return repo.save(st);
    }


}
