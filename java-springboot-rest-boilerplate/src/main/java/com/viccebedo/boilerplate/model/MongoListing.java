/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.viccebedo.boilerplate.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 *
 * @author vcebedo
 */
@Document(collection = "listingsAndReviews")
public class MongoListing {

    private @Field
    String id;

    @Field("listing_url")
    private String listingUrl;

    @Field("name")
    private String name;

    @Field("summary")
    private String summary;

    @Field("space")
    private String space;

    @Field("description")
    private String description;

    @Field("neighborhood_overview")
    private String neighborhoodOverview;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getListingUrl() {
        return listingUrl;
    }

    public void setListingUrl(String listingUrl) {
        this.listingUrl = listingUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
        this.space = space;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNeighborhoodOverview() {
        return neighborhoodOverview;
    }

    public void setNeighborhoodOverview(String neighborhoodOverview) {
        this.neighborhoodOverview = neighborhoodOverview;
    }

}
