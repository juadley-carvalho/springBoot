package com.devsuperior.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.userdept.entities.Department;
import com.devsuperior.userdept.repositories.DepartmentRepository;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {

    @Autowired
    public DepartmentRepository departmentRepository;

    @GetMapping
    public List<Department> findAll(){
        return departmentRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Department findById(@PathVariable Long id){
        return departmentRepository.findById(id).get();
    }

    @PostMapping
    public Department insert(@RequestBody Department department){
        return departmentRepository.save(department);
    }
    
}
