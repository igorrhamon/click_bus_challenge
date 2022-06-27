package org.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import org.model.Place;

import io.quarkus.hibernate.orm.panache.PanacheRepository;








@ApplicationScoped
public class PlaceRepository implements PanacheRepository<Place> {

    public List<Place> findByName(String name) {
        return find("name", name).list();
    }

    public List<Place> findBySlug(String slug) {
        return find("slug", slug).list();
    }

    

    




    
}