package com.shoaib.springboot.controller;

import com.shoaib.springboot.entity.Department;
import com.shoaib.springboot.service.DepartmentService;
import com.shoaib.springboot.service.DepartmentServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Departmentcontroller {
    @Autowired
    private  DepartmentService departmentService;
    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
        return departmentService.saveDepartment(department);




    }
@GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        return departmentService.fetchDepartmentList();
    }
    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.fetchDepartmentById(departmentId);

    }
    @DeleteMapping("/departments/{id}")
    public  String deleteDepartmentById(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return "bahut badhiya bhai delate hogayan";
    }

    @PutMapping("/departments/{id}")
    public  Department updateDepartment(@PathVariable("id") Long departmentId,@RequestBody Department department){

        return departmentService.updateDepartment(departmentId,department);


    }
    @GetMapping("/departments/name/{name}")
    public  Department findByDepartmentNameIgnoreCase(@PathVariable("name") String departmentname){
        return  departmentService.findByDepartmentNameIgnoreCase(departmentname);
    }


}
