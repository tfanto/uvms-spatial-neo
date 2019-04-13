package eu.europa.ec.fisheries.uvms.spatial.rest.resources.secured;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import eu.europa.ec.fisheries.uvms.spatial.model_empty.ServiceLayer;
import eu.europa.ec.fisheries.uvms.spatial.rest.constants.RestConstants;
import eu.europa.ec.fisheries.uvms.spatial.rest.resources.UnionVMSResource;

/**
 * @implicitParam roleName|string|header|true||||||
 * @implicitParam scopeName|string|header|true|EC|||||
 * @implicitParam authorization|string|header|true||||||jwt token
 */
// @Path(SERVICE_LAYER_PATH)
public class ServiceLayerResource extends UnionVMSResource {

	static final String SYSTEM_AREA_TYPE = "BLAJ";
	static final String VIEW = "BLAJ";

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{systemAreaType}")
	public Response getServiceLayerBySystemAreaType(@PathParam(SYSTEM_AREA_TYPE) String systemAreaType, @DefaultValue(RestConstants.PUBLIC) @QueryParam(value = VIEW) String view) {
		return null;
	}

	@GET
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/layer/{layerType}")
	public Response getServiceLayersByType(@PathParam("layerType") String layerType, @HeaderParam("scopeName") String scopeName, @HeaderParam("roleName") String roleName, @Context HttpServletRequest servletRequest) {
		return null;
	}

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("{id}")
	public Response updateServiceLayer(ServiceLayer serviceLayer, @PathParam("id") Long id) {
		return null;
	}

}