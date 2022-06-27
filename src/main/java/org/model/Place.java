package org.model;

/*
 * A place must have the following fields:
 * - name
 * - slug
 * - city
 * - state
 * - created at 
 * - updated at
 */
import javax.persistence.Entity;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

 @Entity
 public class Place extends PanacheEntity {

    private String name;
    private String slug;
    private String city;
    private String state;
    private String createdAt;
    private String updatedAt;


    public String getName() {
        return name;
    }
    public String getSlug() {
        return slug;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public String getCreatedAt() {
        return createdAt;
    }
    public String getUpdatedAt() {
        return updatedAt;
    }

    
 }