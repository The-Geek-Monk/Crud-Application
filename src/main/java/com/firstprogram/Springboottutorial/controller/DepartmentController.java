package com.firstprogram.Springboottutorial.controller;

import com.firstprogram.Springboottutorial.entity.Department;
import com.firstprogram.Springboottutorial.error.DepartmentNotFoundException;
import com.firstprogram.Springboottutorial.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    private final Logger LOGGER =
            LoggerFactory.getLogger(DepartmentController.class);
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        LOGGER.info("Inside saveDepartment of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    //Fetching Department Data
    @GetMapping("/departments")
    public List<Department> fetchDepartment()
    {
        LOGGER.info("Inside fetchDepartment of DepartmentController");
        return departmentService.fetchDepartmentList();
    }

    //Fetching Department Data by ID
    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
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
