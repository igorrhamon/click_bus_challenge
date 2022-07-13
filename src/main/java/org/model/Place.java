package org.model;

import java.time.LocalDateTime;

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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import io.quarkus.hibernate.orm.panache.PanacheEntity;



 @Entity
 public class Place {
     
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    private String name;
    
    private String slug;
    private String city;
    private String state;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp 
    private LocalDateTime updatedAt;

    public Place() {
    }

    public Place( String name, String slug, String city, String state, Long... id) {
        this.name = name;
        this.slug = slug;
        this.city = city;
        this.state = state;
        this.id = id[0];
    
    }



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
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Place [city=" + city + ", name=" + name + ", slug=" + slug + ", state=" + state + "]";
    }

    public Long getId() {
        return this.id;
    }

    
 }