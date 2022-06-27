package org.dao;

import javax.enterprise.context.ApplicationScoped;

import org.model.Place;

@ApplicationScoped
public class PlaceDao {
    
    public Place insertPlace(Place place) {
        if (!place.isPersistent()){
            place.persist();
            return place;
        }
        else return null;
    }
}
