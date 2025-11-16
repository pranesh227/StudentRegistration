package com.SpringProject.SpringProject.Module;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CourseRegistry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String StudentName;
    private String email;
    private String coursetype;




}
