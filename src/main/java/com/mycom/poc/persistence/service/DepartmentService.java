package com.mycom.poc.persistence.service;

import com.mycom.poc.persistence.model.Department;
import com.mycom.poc.persistence.repository.DepartmentRepository;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

  @Autowired
  private DepartmentRepository departmentRepository;

  public Department saveDepartment(Department department) {
    return departmentRepository.save(department);
  }

  public List<Department> fetchDepartmentList() {
    return (List<Department>)
        departmentRepository.findAll();
  }

  public Department updateDepartment(Department department, Long departmentId) {
    Department depDB = departmentRepository.findById(departmentId).get();

    if (Objects.nonNull(department.getDepartmentName())
        && !"".equalsIgnoreCase(
        department.getDepartmentName())) {
      depDB.setDepartmentName(
          department.getDepartmentName());
    }

    if (Objects.nonNull(
        department.getDepartmentAddress())
        && !"".equalsIgnoreCase(
        department.getDepartmentAddress())) {
      depDB.setDepartmentAddress(
          department.getDepartmentAddress());
    }

    if (Objects.nonNull(department.getDepartmentCode())
        && !"".equalsIgnoreCase(
        department.getDepartmentCode())) {
      depDB.setDepartmentCode(
          department.getDepartmentCode());
    }

    return departmentRepository.save(depDB);
  }

  public void deleteDepartmentById(Long departmentId) {
    departmentRepository.deleteById(departmentId);
  }


}
