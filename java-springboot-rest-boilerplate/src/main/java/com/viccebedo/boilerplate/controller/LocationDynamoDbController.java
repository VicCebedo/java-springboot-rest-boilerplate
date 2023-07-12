/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.viccebedo.boilerplate.controller;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.viccebedo.boilerplate.dao.LocationDynamoDbRepository;
import com.viccebedo.boilerplate.model.LocationDynamoDb;
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
@RequestMapping("/dynamodb")
public class LocationDynamoDbController {

    @Autowired
    private AmazonDynamoDB amazonDynamoDB;

    @Autowired
    private LocationDynamoDbRepository locationDynamoDbRepository;

    @GetMapping("/locations")
    Iterable<LocationDynamoDb> getAllLocations() {
//        return this.locationDynamoDbRepository.findAll();
        System.out.println(this.amazonDynamoDB.listTables());
        return null;
    }

    @GetMapping("/location/{id}")
    Optional<LocationDynamoDb> getLocationById(@PathVariable String id) {
        return this.locationDynamoDbRepository.findById(id);
    }
}
