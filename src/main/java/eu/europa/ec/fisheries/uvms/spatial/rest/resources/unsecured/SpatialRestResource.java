package eu.europa.ec.fisheries.uvms.spatial.rest.resources.unsecured;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.neo4j.graphdb.GraphDatabaseService;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import eu.europa.ec.fisheries.uvms.spatial.model_empty.AllAreaTypesRequest;
import eu.europa.ec.fisheries.uvms.spatial.model_empty.AreaByCodeRequest;
import eu.europa.ec.fisheries.uvms.spatial.model_empty.AreaByLocationSpatialRQ;
import eu.europa.ec.fisheries.uvms.spatial.model_empty.BatchSpatialEnrichmentRQ;
import eu.europa.ec.fisheries.uvms.spatial.model_empty.ClosestAreaSpatialRQ;
import eu.europa.ec.fisheries.uvms.spatial.model_empty.ClosestLocationSpatialRQ;
import eu.europa.ec.fisheries.uvms.spatial.model_empty.FilterAreasSpatialRQ;
import eu.europa.ec.fisheries.uvms.spatial.model_empty.GeometryByPortCodeRequest;
import eu.europa.ec.fisheries.uvms.spatial.model_empty.MovementType;
import eu.europa.ec.fisheries.uvms.spatial.model_empty.PingRQ;
import eu.europa.ec.fisheries.uvms.spatial.model_empty.PingRS;
import eu.europa.ec.fisheries.uvms.spatial.model_empty.SpatialEnrichmentRQ;
import eu.europa.ec.fisheries.uvms.spatial.model_empty.SpatialGetMapConfigurationRQ;
import fnt.sys.AppServletContextListener;

/**
 * Rest endpoints for faster dataretrieval We use POST for convinience also for
 * fetch, since it it easy to pass Requests as java Objects
 * <p>
 * OBS we will initially mostly only implement methods used from Movement and
 * Reporting
 */

@Path("json")
@SuppressWarnings("unchecked")
public class SpatialRestResource {

	// private static final ObjectMapper MAPPER = new
	// ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
	// false).registerModule(new JavaTimeModule());
	private static final ObjectMapper MAPPER = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

	@POST
	@Path("getAreaByLocation")
	@Consumes(value = { MediaType.APPLICATION_JSON })
	@Produces(value = { MediaType.APPLICATION_JSON })
	public Response getAreaByLocation(AreaByLocationSpatialRQ areaByLocationSpatialRQ) {

		return Response.ok().build();
	}

	@POST
	@Path("getAreaTypes")
	@Consumes(value = { MediaType.APPLICATION_JSON })
	@Produces(value = { MediaType.APPLICATION_JSON })
	public Response getAreaTypes(AllAreaTypesRequest allAreaTypesRequest) {
		return Response.ok().build();
	}

	@POST
	@Path("getClosestArea")
	@Consumes(value = { MediaType.APPLICATION_JSON })
	@Produces(value = { MediaType.APPLICATION_JSON })
	public Response getClosestArea(ClosestAreaSpatialRQ request) {

		return Response.ok().build();
	}

	@POST
	@Path("getClosestLocation")
	@Consumes(value = { MediaType.APPLICATION_JSON })
	@Produces(value = { MediaType.APPLICATION_JSON })
	public Response getClosestLocation(ClosestLocationSpatialRQ closestLocationSpatialRQ) {

		return Response.ok().build();
	}

	private static final double DISTANCE_TO_PORT_THRESHOLD_IN_NAUTICAL_MILES = 1.5; // meters = 2778
	private static final double FACTOR_METER_PER_SECOND_TO_KNOTS = 1.9438444924574;
	private static final double NAUTICAL_MILE_ONE_METER = 0.000539956803;

	@POST
	@Path("getSegmentCategoryType")
	@Consumes(value = { MediaType.APPLICATION_JSON })
	@Produces(value = { MediaType.APPLICATION_JSON })
	public Response getSegmentCategoryType(List<MovementType> movements) {

		return Response.ok().build();
	}

	private static final int EARTH_RADIUS_METER = 6371000;

	private static double distanceMeter(double prevLat, double prevLon, double currentLat, double currentLon) {
		double lat1Rad = Math.toRadians(prevLat);
		double lat2Rad = Math.toRadians(currentLat);
		double deltaLonRad = Math.toRadians(currentLon - prevLon);

		return Math.acos(Math.sin(lat1Rad) * Math.sin(lat2Rad) + Math.cos(lat1Rad) * Math.cos(lat2Rad) * Math.cos(deltaLonRad)) * EARTH_RADIUS_METER;
	}

	@GET
	@Path("getEnrichmentAndTransitions")
	@Consumes(value = { MediaType.APPLICATION_JSON })
	@Produces(value = { MediaType.APPLICATION_JSON })
	public Response getEnrichmentAndTransitions(@QueryParam(value = "firstLongitude") Double firstLongitude, @QueryParam(value = "firstLatitude") Double firstLatitude, @QueryParam(value = "secondLongitude") Double secondLongitude,
			@QueryParam(value = "secondLatitude") Double secondLatitude) {

		return Response.ok().build();
	}

	@POST
	@Path("getEnrichment")
	@Consumes(value = { MediaType.APPLICATION_JSON })
	@Produces(value = { MediaType.APPLICATION_JSON })
	public Response getEnrichment(SpatialEnrichmentRQ spatialEnrichmentRQ) {

		return Response.ok().build();
	}

	@POST
	@Path("getEnrichmentBatch")
	@Consumes(value = { MediaType.APPLICATION_JSON })
	@Produces(value = { MediaType.APPLICATION_JSON })
	public Response getEnrichmentBatch(BatchSpatialEnrichmentRQ batchSpatialEnrichmentRQ) {

		return Response.ok().build();
	}

	@POST
	@Path("getFilterArea")
	@Consumes(value = { MediaType.APPLICATION_JSON })
	@Produces(value = { MediaType.APPLICATION_JSON })
	public Response getFilterArea(FilterAreasSpatialRQ filterAreasSpatialRQ) {

		return Response.ok().build();
	}

	@POST
	@Path("getMapConfiguration")
	@Consumes(value = { MediaType.APPLICATION_JSON })
	@Produces(value = { MediaType.APPLICATION_JSON })
	public Response getMapConfiguration(SpatialGetMapConfigurationRQ spatialGetMapConfigurationRQ) {

		return Response.ok().build();
	}

	@POST
	@Path("ping")
	@Consumes(value = { MediaType.APPLICATION_JSON })
	@Produces(value = { MediaType.APPLICATION_JSON })
	public Response ping(PingRQ pingrq) {

		try {
			PingRS response = new PingRS();
			return Response.ok(response).build();
		} catch (Exception e) {
			return Response.status(500).build();
		}
	}

	@GET
	@Path("ping")
	@Consumes(value = { MediaType.APPLICATION_JSON })
	@Produces(value = { MediaType.APPLICATION_JSON })

	public Response pong2() {

		GraphDatabaseService db = AppServletContextListener.getDB();
		

		return Response.ok("Pong").build();
	}

	@POST
	@Path("getAreaByCode")
	@Consumes(value = { MediaType.APPLICATION_JSON })
	@Produces(value = { MediaType.APPLICATION_JSON })
	public Response getAreaByCode(AreaByCodeRequest areaByCodeRequest) {

		return Response.ok().build();
	}

	@POST
	@Path("getGeometryByPortCode")
	@Consumes(value = { MediaType.APPLICATION_JSON })
	@Produces(value = { MediaType.APPLICATION_JSON })
	public Response getGeometryByPortCode(GeometryByPortCodeRequest geometryByPortCodeRequest) {
		return Response.ok().build();
	}
}
