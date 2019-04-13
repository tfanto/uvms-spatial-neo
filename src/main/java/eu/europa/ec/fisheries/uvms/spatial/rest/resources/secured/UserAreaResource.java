package eu.europa.ec.fisheries.uvms.spatial.rest.resources.secured;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


import eu.europa.ec.fisheries.uvms.spatial.model_empty.UserAreaGeoJsonDto;
import eu.europa.ec.fisheries.uvms.spatial.model_empty.UserAreaUpdateDto;
import eu.europa.ec.fisheries.uvms.spatial.rest.dto.FilterType;
import eu.europa.ec.fisheries.uvms.spatial.rest.dto.UserAreaCoordinateType;
import eu.europa.ec.fisheries.uvms.spatial.rest.resources.UnionVMSResource;

/**
 * @implicitParam roleName|string|header|true||||||
 * @implicitParam scopeName|string|header|true|EC|||||
 * @implicitParam authorization|string|header|true||||||jwt token
 */
@Path("/userarea")
public class UserAreaResource extends UnionVMSResource {

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/")
	public Response storeUserArea(UserAreaGeoJsonDto userAreaGeoJsonDto, @Context HttpServletRequest servletRequest) {
		return null;

	}

	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteUserArea(@PathParam("id") Long userAreaId, @HeaderParam("scopeName") String scopeName, @Context HttpServletRequest servletRequest) {
		return null;
	}

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/layers")
	public Response getUserAreaLayerMapping(@HeaderParam("scopeName") String scopeName, @Context HttpServletRequest servletRequest) {
		return null;
	}

	@POST
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/details")
	public Response getUserAreaDetails(UserAreaCoordinateType userAreaTypeDto, @HeaderParam("scopeName") String scopeName, @Context HttpServletRequest servletRequest) {
		return null;
	}

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/types")
	public Response getUserAreaTypes(@HeaderParam("scopeName") String scopeName, @Context HttpServletRequest servletRequest) {
		return null;
	}

	@POST
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/updatedate")
	public Response updateUserAreaDates(UserAreaUpdateDto userAreaUpdateDto, @Context HttpServletRequest servletRequest) {
		return null;
	}

	private boolean isPowerUser(HttpServletRequest request) {
		return request.isUserInRole("MANAGE_ANY_USER_AREA");
	}

	private Response getUserAreaDetailsById(UserAreaCoordinateType userAreaTypeDto, String userName, boolean isPowerUser, String scopeName) {
		return null;
	}

	private Response getUserAreaDetailsByLocation(UserAreaCoordinateType userAreaTypeDto, String userName)  {

		return null;
	}

	@PUT
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateUserArea(UserAreaGeoJsonDto userAreaGeoJsonDto, @HeaderParam("scopeName") String scopeName, @Context HttpServletRequest servletRequest) {
		return null;
	}

	@POST
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/byfilter")
	public Response searchUserAreas(FilterType filter, @HeaderParam("scopeName") String scopeName, @Context HttpServletRequest servletRequest) {
		return null;
	}

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/list")
	public Response listUserAreas(@HeaderParam("scopeName") String scopeName, @Context HttpServletRequest servletRequest) {
		return null;
	}

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/list/{type}")
	public Response listUserAreasByType(@PathParam("type") String userAreaType, @HeaderParam("scopeName") String scopeName, @Context HttpServletRequest servletRequest) {
		return null;
	}
}