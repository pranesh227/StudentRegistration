package com.SpringProject.SpringProject.Controller;

import com.SpringProject.SpringProject.Module.Student;
import com.SpringProject.SpringProject.Service.ServiceStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ControlStudent {
    @Autowired
    ServiceStudent service;
    @PostMapping("Stud/Add")
    public Student studentadd(@RequestParam String name,
                                    @RequestBody String course,
                                    @RequestParam String trainer) {
        return service.studdetailAdd(name,course,trainer);
    }

}
