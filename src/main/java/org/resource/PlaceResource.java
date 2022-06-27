package org.resource;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.model.Place;
import org.repository.PlaceRepository;
import org.dao.PlaceDao;

@Path("/places")
public class PlaceResource {
    
    @Inject
    PlaceRepository placeRepository;

    @Inject
    PlaceDao placeDao;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Place> getPlaces() {
        return placeRepository.findAll().list();
    }


    @Transactional
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/create")
    public Place createPlace(@QueryParam("name") String name, @QueryParam("slug") String slug, @QueryParam("city") String city, @QueryParam("state") String state) {
        Place place = new Place(name, slug, city, state);
        return placeDao.insertPlace(place);
    }
}
