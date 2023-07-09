/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.viccebedo.boilerplate;

import com.viccebedo.boilerplate.db.UserRepository;
import com.viccebedo.boilerplate.model.User;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Vic Cebedo <cebedo.vii@gmail.com>
 */
@RestController
public class UserController {

    private final UserRepository repository;

    UserController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/users")
    Iterable<User> allUser() {
        return this.repository.findAll();
    }

    @GetMapping("/user/{id}")
    Optional<User> userById(@PathVariable Long id) {
        return this.repository.findById(id);
    }

    @DeleteMapping("/user/{id}")
    void deleteUser(@PathVariable Long id) {
        this.repository.deleteById(id);
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
