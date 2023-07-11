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

/**
 *
 * @author Vic Cebedo <cebedo.vii@gmail.com>
 */
@RestController
public class SqlUserController {

    private final SqlUserRepository sqlUserRepo;

    SqlUserController(SqlUserRepository repository) {
        this.sqlUserRepo = repository;
    }

    @GetMapping("/users")
    Iterable<SqlUser> allUser() {
        return this.sqlUserRepo.findAll();
    }

    @GetMapping("/user/{id}")
    Optional<SqlUser> userById(@PathVariable Long id) {
        return this.sqlUserRepo.findById(id);
    }

    @DeleteMapping("/user/{id}")
    void deleteUser(@PathVariable Long id) {
        this.sqlUserRepo.deleteById(id);
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
