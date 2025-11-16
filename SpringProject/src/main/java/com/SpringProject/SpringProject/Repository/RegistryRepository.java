package com.SpringProject.SpringProject.Repository;

import com.SpringProject.SpringProject.Module.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistryRepository extends JpaRepository<CourseRegistry,Integer> {

}
