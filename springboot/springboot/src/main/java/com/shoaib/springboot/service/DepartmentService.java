package com.shoaib.springboot.service;

import com.shoaib.springboot.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

   public List<Department> fetchDepartmentList();

public     Department fetchDepartmentById(Long departmentId);

 public   void deleteDepartmentById(Long departmentId);

   public Department updateDepartment(Long departmentId, Department department);





    Department findByDepartmentNameIgnoreCase(String departmentname);
}

