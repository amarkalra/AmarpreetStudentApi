package com.capone.repositories;

import org.springframework.data.repository.CrudRepository;

import com.capone.domain.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
