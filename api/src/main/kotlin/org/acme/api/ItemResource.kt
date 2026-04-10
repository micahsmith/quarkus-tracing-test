package org.acme.api

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.PathParam

@Path("/items")
class ItemResource {

  @GET fun list(): List<String> = listOf("item-1", "item-2")

  @GET @Path("/{id}") fun get(@PathParam("id") id: String): String = "item-$id"
}
