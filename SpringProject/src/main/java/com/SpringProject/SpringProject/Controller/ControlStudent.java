package com.SpringProject.SpringProject.Controller;

import com.SpringProject.SpringProject.Module.CourseRegistry;
import com.SpringProject.SpringProject.Module.Courses;
import com.SpringProject.SpringProject.Service.ServiceStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class ControlStudent {
    @Autowired
    ServiceStudent service;
    @PostMapping("Stud/Add")
    public Courses studentadd(@RequestParam String name,
                              @RequestBody String course,
                              @RequestParam String trainer) {
        return service.studdetailAdd(name,course,trainer);
    }
    @PostMapping("Stud")
    public Courses putStud(@RequestBody Courses st){
        return service.studdet(st);
    }

    @PostMapping("Registry")
    public CourseRegistry Studregistry(@RequestBody CourseRegistry cr){
        return service.resstud(cr);
    }

}
