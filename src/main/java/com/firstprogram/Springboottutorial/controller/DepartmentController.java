package com.firstprogram.Springboottutorial.controller;

import com.firstprogram.Springboottutorial.entity.Department;
import com.firstprogram.Springboottutorial.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    //Fetching Department Data
    @GetMapping("/departments")
    public List<Department> fetchDepartment()
    {
        return departmentService.fetchDepartmentList();
    }

    //Fetching Department Data by ID
    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId)
    {
        return departmentService.fetchDepartmentByID(departmentId);

    }
    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId)
    {
        departmentService.deleteDepartmentById(departmentId);
        return "Department deleted Successfully !!!";

    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId,@RequestBody Department department){
        return departmentService.updateDepartment(departmentId,department);

    }
    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName)
    {
        return departmentService.fetchDepartmentByName(departmentName);
    }
}
