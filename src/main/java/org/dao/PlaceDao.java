package org.dao;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.model.Place;
import org.repository.PlaceRepository;

@ApplicationScoped
public class PlaceDao {

    @Inject
    PlaceRepository placeRepository;
    
    public Place insertPlace(Place place) {
        if(placeRepository.findById(place.getId()) == null) {
             placeRepository.persist(place);
             return place;
        }
        return null;
    }

    public Place updatePlace(Place place) {

        try {
            Place newPlace = placeRepository.findById(place.getId());
            newPlace.setName(place.getName());
            newPlace.setSlug(place.getSlug());
            newPlace.setCity(place.getCity());
            newPlace.setState(place.getState());
            placeRepository.persist(newPlace);
            return newPlace;
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
        
    }
}
