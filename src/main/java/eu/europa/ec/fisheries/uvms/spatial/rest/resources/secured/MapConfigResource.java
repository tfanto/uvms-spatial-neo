package eu.europa.ec.fisheries.uvms.spatial.rest.resources.secured;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import eu.europa.ec.fisheries.uvms.spatial.rest.resources.UnionVMSResource;

/**
 * @implicitParam roleName|string|header|true||||||
 * @implicitParam scopeName|string|header|true|EC|||||
 * @implicitParam authorization|string|header|true||||||jwt token
 */
@Path("/mapconfig")
public class MapConfigResource extends UnionVMSResource {

	@Context
	private HttpServletRequest servletRequest;

	@GET
	@Produces(value = { MediaType.APPLICATION_JSON })
	@Path("{id}")
	public Response getMapConfigBy(@PathParam("id") Integer reportId, @HeaderParam("scopeName") String scopeName, @HeaderParam("roleName") String roleName) {
		return null;
	}

}