/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.viccebedo.boilerplate.controller;

import com.viccebedo.boilerplate.dao.MongoListingRepository;
import com.viccebedo.boilerplate.model.MongoListing;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author vcebedo
 */
@RestController
@RequestMapping("/mongo")
public class MongoListingController {

    @Autowired
    private MongoListingRepository mongoListingRepository;

    @GetMapping("/listings")
    List<MongoListing> getAllMongoListings() {
        return this.mongoListingRepository.findAll();
    }

    @GetMapping("/listing/{id}")
    Optional<MongoListing> getMongoListingById(@PathVariable String id) {
        return this.mongoListingRepository.findById(id);
    }

}
