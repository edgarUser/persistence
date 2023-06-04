package com.mycom.poc.persistence.repository;

import com.mycom.poc.persistence.model.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {

}
