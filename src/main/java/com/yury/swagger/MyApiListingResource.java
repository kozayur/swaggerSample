package com.yury.swagger;

import javax.servlet.ServletConfig;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import io.swagger.annotations.ApiOperation;
import io.swagger.jaxrs.listing.ApiListingResource;

@Path("/")
public class MyApiListingResource extends ApiListingResource {
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Path("/api-docs")
    @ApiOperation(value = "The swagger definition in JSON", hidden = true)
    @Override
    public Response getListing(@Context Application app, @Context ServletConfig sc, @Context HttpHeaders headers, @Context UriInfo uriInfo, String type) {
        return super.getListing(app, sc, headers, uriInfo, type);
    }
}
