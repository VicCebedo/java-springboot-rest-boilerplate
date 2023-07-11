/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.viccebedo.boilerplate.controller;

import com.viccebedo.boilerplate.dao.MongoListingRepository;
import com.viccebedo.boilerplate.model.MongoListing;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author vcebedo
 */
@RestController
public class MongoListingController {

    private final MongoListingRepository mongoListingRepo;

    MongoListingController(MongoListingRepository repo) {
        this.mongoListingRepo = repo;
    }

    @GetMapping("/mongo-listings")
    List<MongoListing> getAllMongoListing() {
        return this.mongoListingRepo.findAll();
    }

    @GetMapping("/mongo-listing/{id}")
    Optional<MongoListing> getMongoListingById(@PathVariable String id) {
        return this.mongoListingRepo.findById(id);
    }

}
