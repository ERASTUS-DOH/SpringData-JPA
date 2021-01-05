package com.Inspire.SpringBoot.Data.JPA.Repositories;

import com.Inspire.SpringBoot.Data.JPA.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
