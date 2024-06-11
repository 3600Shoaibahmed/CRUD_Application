package com.shoaib.springboot.repository;

import com.shoaib.springboot.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

public Department findByDepartmentName(String departmentName);
public Department findByDepartmentNameIgnoreCase(String departmentname);
}
