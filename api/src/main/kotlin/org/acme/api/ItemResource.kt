package org.acme.api

import io.smallrye.common.annotation.Blocking
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.PathParam

@Path("/items")
class ItemResource {

  @GET @Blocking fun list(): List<String> = listOf("item-1", "item-2")

  @GET @Path("/{id}") @Blocking fun get(@PathParam("id") id: String): String = "item-$id"
}
