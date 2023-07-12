/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.viccebedo.boilerplate.controller;

import com.viccebedo.boilerplate.model.SqlUser;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.viccebedo.boilerplate.dao.SqlUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Vic Cebedo <cebedo.vii@gmail.com>
 */
@RestController
@RequestMapping("/sql")
public class SqlUserController {

    @Autowired
    private SqlUserRepository sqlUserRepository;

    @GetMapping("/users")
    Iterable<SqlUser> getAllUsers() {
        return this.sqlUserRepository.findAll();
    }

    @GetMapping("/user/{id}")
    Optional<SqlUser> userById(@PathVariable Long id) {
        return this.sqlUserRepository.findById(id);
    }

    @DeleteMapping("/user/{id}")
    void deleteUser(@PathVariable Long id) {
        this.sqlUserRepository.deleteById(id);
    }

//
//    @PostMapping("/employees")
//    Employee newEmployee(@RequestBody User newEmployee) {
//        return this.repository.save(newEmployee);
//    }
//
//    @PutMapping("/employees/{id}")
//    User replaceEmployee(
//            @RequestBody Employee newEmployee,
//            @PathVariable Long id) {
//
//        return this.repository.findById(id)
//                .map(employee -> {
//                    employee.setName(newEmployee.getName());
//                    employee.setRole(newEmployee.getRole());
//                    return this.repository.save(employee);
//                })
//                .orElseGet(() -> {
//                    newEmployee.setId(id);
//                    return this.repository.save(newEmployee);
//                });
//    }
//
}
