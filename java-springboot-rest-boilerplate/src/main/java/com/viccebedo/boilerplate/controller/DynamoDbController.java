/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.viccebedo.boilerplate.controller;

//import com.viccebedo.boilerplate.dao.LocationDynamoDbRepository;
import com.viccebedo.boilerplate.model.DynamoDbData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbEnhancedClient;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbTable;
import software.amazon.awssdk.enhanced.dynamodb.TableSchema;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;

/**
 *
 * @author vcebedo
 */
@RestController
@RequestMapping("/dynamodb")
public class DynamoDbController {

    @Autowired
    private DynamoDbClient dynamoDbClient;

    @GetMapping("/locations")
    List<DynamoDbData> getAllLocations() {
        DynamoDbEnhancedClient enhancedClient = DynamoDbEnhancedClient.builder()
                .dynamoDbClient(this.dynamoDbClient)
                .build();

        // Get the table and all results.
        DynamoDbTable<DynamoDbData> table = enhancedClient
                .table(
                        "locations",
                        TableSchema.fromBean(DynamoDbData.class));
        Iterator<DynamoDbData> results = table.scan().items().iterator();

        // Push all results to an array list.
        ArrayList<DynamoDbData> resultList = new ArrayList<>();
        while (results.hasNext()) {
            resultList.add(results.next());
        }

        return resultList;
    }
}
