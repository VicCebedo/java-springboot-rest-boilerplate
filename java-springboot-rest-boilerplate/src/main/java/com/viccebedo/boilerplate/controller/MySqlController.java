/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.viccebedo.boilerplate.controller;

import com.viccebedo.boilerplate.model.MySqlData;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import com.viccebedo.boilerplate.dao.MySqlRepository;

/**
 *
 * @author Vic Cebedo <cebedo.vii@gmail.com>
 */
@RestController
@RequestMapping("/mysql")
public class MySqlController {

    @Autowired
    private MySqlRepository mySqlRepository;

    @GetMapping("/users")
    Iterable<MySqlData> getAllUsers() {
        return this.mySqlRepository.findAll();
    }

    @GetMapping("/user/{id}")
    Optional<MySqlData> getUserById(@PathVariable Long id) {
        return this.mySqlRepository.findById(id);
    }

    @DeleteMapping("/user/{id}")
    void deleteUser(@PathVariable Long id) {
        this.mySqlRepository.deleteById(id);
    }
}
