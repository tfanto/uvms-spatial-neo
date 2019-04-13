package eu.europa.ec.fisheries.uvms.spatial.rest.resources.secured;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import eu.europa.ec.fisheries.uvms.spatial.rest.resources.UnionVMSResource;
import eu.europa.ec.fisheries.uvms.spatial.service.dto.bookmark.Bookmark;

/**
 * @implicitParam roleName|string|header|true||||||
 * @implicitParam scopeName|string|header|true|EC|||||
 * @implicitParam authorization|string|header|true||||||jwt token
 */
@Path("/bookmark")
public class BookmarkResource extends UnionVMSResource {

	@GET
	@Produces(value = { MediaType.APPLICATION_JSON })
	public Response list(@Context HttpServletRequest servletRequest) {

		return null;
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createBookmark(final Bookmark bookmark, @Context HttpServletRequest servletRequest) {

		return null;
	}

	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteReport(@PathParam("id") Long id, @Context HttpServletRequest servletRequest) {

		return null;
	}

	@PUT
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateBookmark(Bookmark bookmark, @PathParam("id") Long id, @Context HttpServletRequest servletRequest) {
		return null;
	}
}
