package com.ghh;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloWorldResource {

    @GET
    @Path("{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public String sayHello(@PathParam("name") String name) {
        return "hello " + name;
    }
}