package com.SpringProject.SpringProject.Service;

import com.SpringProject.SpringProject.Module.CourseRegistry;
import com.SpringProject.SpringProject.Module.Courses;
import com.SpringProject.SpringProject.Repository.RegistryRepository;
import com.SpringProject.SpringProject.Repository.RepoStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceStudent {
    @Autowired
    RepoStudent repo;

    @Autowired
    RegistryRepository regrepo;

    public Courses studdetailAdd(String name, String course, String trainer) {
        Courses ss=new Courses();
        ss.setCourseName(name);
        ss.setCourseType(course);
        ss.setTrainer(trainer);
       return  repo.save(ss);
//        return "Added SuccessFully";
    }

    public Courses studdet(Courses st) {
         return repo.save(st);
    }

    public CourseRegistry resstud(CourseRegistry cr) {
        return regrepo.save(cr);
    }
}
