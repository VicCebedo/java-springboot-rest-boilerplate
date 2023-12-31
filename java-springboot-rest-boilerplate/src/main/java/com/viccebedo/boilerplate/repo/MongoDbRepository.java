/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.viccebedo.boilerplate.repo;

import com.viccebedo.boilerplate.model.MongoDbData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author vcebedo
 */
@Repository
public interface MongoDbRepository extends MongoRepository<MongoDbData, Object> {

}
