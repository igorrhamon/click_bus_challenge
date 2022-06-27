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

    public Place updatePlace(Place place) {

        try {
            Place newPlace = Place.findById(place.id);
            newPlace.setName(place.getName());
            newPlace.setSlug(place.getSlug());
            newPlace.setCity(place.getCity());
            newPlace.setState(place.getState());
            newPlace.persist();
            return newPlace;
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
        
    }
}
