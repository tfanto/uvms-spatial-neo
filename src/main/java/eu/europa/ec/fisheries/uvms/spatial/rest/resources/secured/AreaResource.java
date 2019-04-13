
package eu.europa.ec.fisheries.uvms.spatial.rest.resources.secured;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import eu.europa.ec.fisheries.uvms.spatial.model.constants.AuthConstants;
import eu.europa.ec.fisheries.uvms.spatial.model_empty.AreaByCodeJsonPayload;
import eu.europa.ec.fisheries.uvms.spatial.model_empty.AreaByLocationSpatialRQ;
import eu.europa.ec.fisheries.uvms.spatial.model_empty.AreaByLocationSpatialRS;
import eu.europa.ec.fisheries.uvms.spatial.model_empty.ClosestAreaSpatialRQ;
import eu.europa.ec.fisheries.uvms.spatial.model_empty.ClosestAreaSpatialRS;
import eu.europa.ec.fisheries.uvms.spatial.model_empty.ClosestLocationSpatialRQ;
import eu.europa.ec.fisheries.uvms.spatial.model_empty.ClosestLocationSpatialRS;
import eu.europa.ec.fisheries.uvms.spatial.rest.dto.AreaCoordinateType;
import eu.europa.ec.fisheries.uvms.spatial.rest.dto.AreaFilterType;
import eu.europa.ec.fisheries.uvms.spatial.rest.dto.LocationQueryDto;
import eu.europa.ec.fisheries.uvms.spatial.rest.resources.UnionVMSResource;

/**
 * @implicitParam roleName|string|header|true||||||
 * @implicitParam scopeName|string|header|true|EC|||||
 * @implicitParam authorization|string|header|true||||||jwt token
 */
public class AreaResource extends UnionVMSResource {

	/**
	 * Return the list of all area types.
	 *
	 *
	 * @responseMessage 200 ok
	 * @responseMessage 404 not found
	 */
	@GET
	@Produces(value = { MediaType.APPLICATION_JSON })
	@Path("/types")
	public Response getAreaTypes() {
		return null;
	}

	/**
	 * Endpoint to get location details for given coordinate
	 *
	 * @param query
	 *
	 * @see LocationQueryDto
	 *
	 * @responseMessage 200 ok
	 * @responseMessage 404 not found
	 */
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/location/details")
	public Response getLocationByPointOrById(LocationQueryDto query) {
		return null;
	}

	@POST
	@Produces(value = { MediaType.APPLICATION_XML })
	@Consumes(value = { MediaType.APPLICATION_XML })
	@Path("/location/details")
	public ClosestLocationSpatialRS getLocationByPoint(ClosestLocationSpatialRQ request) {

		return null;
	}

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/properties")
	public Response getAreaProperties(List<AreaCoordinateType> areaDtoList) {
		return null;
	}

	/**
	 *
	 * @param areaDto
	 *
	 * @see
	 * @return
	 * @throws ServiceException
	 */
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/details")
	public Response getAreasByPointOrById(AreaCoordinateType areaDto, @Context HttpServletRequest servletRequest) {
		return null;
	}

	@POST
	@Produces(value = { MediaType.APPLICATION_XML })
	@Consumes(value = { MediaType.APPLICATION_XML })
	@Path("/details")
	public AreaByLocationSpatialRS getAreasByPoint(AreaByLocationSpatialRQ request) {

		return null;

	}

	@POST
	@Produces(value = { MediaType.APPLICATION_XML })
	@Consumes(value = { MediaType.APPLICATION_XML })
	@Path("/closest")
	public ClosestAreaSpatialRS getClosestAreasToPointByType(ClosestAreaSpatialRQ request) {
		return null;
	}

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/layers")
	public Response getSystemAreaLayerMapping(@Context HttpServletRequest request, @HeaderParam(AuthConstants.HTTP_HEADER_SCOPE_NAME) String scopeName, @HeaderParam(AuthConstants.HTTP_HEADER_ROLE_NAME) String roleName) {
		return Response.ok().build();
	}

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/locationlayers")
	public Response getSystemAreaAndLocationLayerMapping(@Context HttpServletRequest request, @HeaderParam(AuthConstants.HTTP_HEADER_SCOPE_NAME) String scopeName, @HeaderParam(AuthConstants.HTTP_HEADER_ROLE_NAME) String roleName)
			 {
		return Response.ok().build();
	}

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/byfilter")
	public Response searchAreasByNameOrCode(AreaFilterType areaFilterType) {
		return Response.ok().build();
	}

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/bycode")
	public Response searchAreaNamesByCode(AreaFilterType areaFilterType) {
		return Response.ok().build();
	}

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/datasets/{areaType}/{areaGid}/{datasetName}")
	public Response createDataset(@PathParam("areaType") String areaType, @PathParam("areaGid") String areaGid, @PathParam("datasetName") String dataSetName, @Context HttpServletRequest request) {
		return Response.ok().build();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/type/code")
	public Response byCode(AreaByCodeJsonPayload payload) {

		return Response.ok().build();
	}
}