package com.SpringProject.SpringProject.Controller;

import com.SpringProject.SpringProject.Module.Courses;
import com.SpringProject.SpringProject.Module.Stud_Register;
import com.SpringProject.SpringProject.Service.ServiceStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ControlStudent {
    @Autowired
    ServiceStudent service;

    //================================================Student registration=================================================================//

    @PostMapping("Stud/Add")
    public String  studentadd(@RequestParam String name,
                                    @RequestParam String email,
                                    @RequestParam String course
                                    ) {
        service.studputdet(name,email,course);
        return "Registered SuccessFully";
    }

    @GetMapping("getStud")
    public List<Stud_Register> gerstuddet(){
        return service.servgetstud();
    }


    //=======================================================Course List=================================================================//
    @PostMapping("Stud")
    public Courses putStud(@RequestBody Courses st){
        return service.studdet(st);
    }

    @GetMapping("ListOfCourse")
    public List<Courses> ListOfCourse(){
        return service.ListStud();
    }




    //======================================================Registered Student=================================================================//



}
