/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.viccebedo.boilerplate.controller;

import com.viccebedo.boilerplate.model.MongoDbData;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.viccebedo.boilerplate.repo.MongoDbRepository;

/**
 *
 * @author vcebedo
 */
@RestController
@RequestMapping("/mongodb")
public class MongoDbController {

    @Autowired
    private MongoDbRepository mongoDbRepository;

    @GetMapping("/listings")
    List<MongoDbData> getAllListings() {
        return this.mongoDbRepository.findAll();
    }

    @GetMapping("/listing/{id}")
    Optional<MongoDbData> getListingById(@PathVariable String id) {
        return this.mongoDbRepository.findById(id);
    }

}
