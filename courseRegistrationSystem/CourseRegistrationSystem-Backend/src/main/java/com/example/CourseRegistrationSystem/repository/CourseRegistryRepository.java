package com.example.CourseRegistrationSystem.repository;

import com.example.CourseRegistrationSystem.model.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegistryRepository extends JpaRepository<CourseRegistry,Integer> {

}
