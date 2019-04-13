package eu.europa.ec.fisheries.uvms.spatial.rest.resources.unsecured;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class HealthResource {

	private static final String APPLICATION_VERSION = "application.version";
	private static final String APPLICATION_NAME = "application.name";

	@GET
	@Produces(value = { MediaType.APPLICATION_JSON })
	public Response getDoctor() {
		return Response.ok().build();
	}
}
