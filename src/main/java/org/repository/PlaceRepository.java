package org.repository;

import org.model.Place;
import io.quarkus.hibernate.reactive.panache.PanacheRepository;


public class PlaceRepository implements PanacheRepository<Place> {

    public Place findBySlug(String slug) {
        return find("slug", slug).firstResult();
    }



    
}
