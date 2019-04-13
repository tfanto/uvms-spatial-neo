package eu.europa.ec.fisheries.uvms.spatial.rest.resources.secured;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import eu.europa.ec.fisheries.uvms.spatial.rest.resources.UnionVMSResource;

/**
 * @implicitParam roleName|string|header|true||||||
 * @implicitParam scopeName|string|header|true|EC|||||
 * @implicitParam authorization|string|header|true||||||jwt token
 */
@Path("/countries")
public class CountryResource extends UnionVMSResource {

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getAllCountriesDesc() {
		return null;
	}
}