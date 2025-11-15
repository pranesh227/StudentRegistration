package com.SpringProject.SpringProject.Service;

import com.SpringProject.SpringProject.Module.Student;
import com.SpringProject.SpringProject.Repository.RepoStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceStudent {
    @Autowired
    RepoStudent repo;

    public Student studdetailAdd(String name, String course, String trainer) {
        Student ss=new Student();
        ss.setName(name);
        ss.setName(course);
        ss.setName(trainer);
       return  repo.save(ss);
//        return "Added SuccessFully";
    }
}
