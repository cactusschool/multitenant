package com.ashish.cactus.school.multitenant.controller;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ashish.cactus.school.multitenant.db.model.ModuleMaster;
import com.ashish.cactus.school.multitenant.db.repositories.ModuleMasterRepository;
import com.ashish.cactus.school.multitenant.input.ModuleDetails;

@Component
@Path("/module")
public class ModuleMasterController {

	@Autowired
    private ModuleMasterRepository moduleMasterRepo;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ModuleDetails> getAll() {
        // Return the DTO List:
        return null;
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public ModuleMaster get(@PathParam("id") int id) {
    	Optional<ModuleMaster> customer = moduleMasterRepo.findById(id);

        // Return the DTO:
        return customer.get();
    }
}