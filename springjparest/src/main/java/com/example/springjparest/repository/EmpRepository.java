package com.example.springjparest.repository;

import com.example.springjparest.entity.Emp;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends CrudRepository<Emp,Long> {
}
