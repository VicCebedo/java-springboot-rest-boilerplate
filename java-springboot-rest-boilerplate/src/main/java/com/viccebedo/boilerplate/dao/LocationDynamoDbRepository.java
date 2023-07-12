/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.viccebedo.boilerplate.dao;

import com.viccebedo.boilerplate.model.LocationDynamoDb;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author vcebedo
 */
@org.socialsignin.spring.data.dynamodb.repository.EnableScan
public interface LocationDynamoDbRepository extends CrudRepository<LocationDynamoDb, Object> {

}
