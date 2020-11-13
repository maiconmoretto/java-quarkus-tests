package org.acme.getting.started.controller;

import org.acme.getting.started.service.CalculadoraService;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/calculadora")
public class CalculadoraResource {

    @Inject
    CalculadoraService service;

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/soma/{a}/{b}")
    public Integer soma(@PathParam("a") Integer a, @PathParam("b") Integer b) {
        return service.soma(a, b);
    }
}