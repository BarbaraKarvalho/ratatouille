package com.ratatouille;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello") //nome do path para refeição
//criar novo resource, classe similar a essa

public class GreetingResource {
//criar um @post (passando algo), diferente do @get para meal
    //criar um resource para receber meal com a descrição (atributo da classe descrição)
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }
}