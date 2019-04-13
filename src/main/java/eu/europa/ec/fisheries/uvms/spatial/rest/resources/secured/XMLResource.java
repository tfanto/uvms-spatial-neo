package eu.europa.ec.fisheries.uvms.spatial.rest.resources.secured;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import eu.europa.ec.fisheries.uvms.spatial.model_empty.AreaByLocationSpatialRQ;
import eu.europa.ec.fisheries.uvms.spatial.model_empty.AreaByLocationSpatialRS;
import eu.europa.ec.fisheries.uvms.spatial.model_empty.FilterAreasSpatialRQ;
import eu.europa.ec.fisheries.uvms.spatial.model_empty.FilterAreasSpatialRS;
import eu.europa.ec.fisheries.uvms.spatial.model_empty.SpatialEnrichmentRQ;
import eu.europa.ec.fisheries.uvms.spatial.model_empty.SpatialEnrichmentRS;

/**
 * @implicitParam roleName|string|header|true||||||
 * @implicitParam scopeName|string|header|true|EC|||||
 * @implicitParam authorization|string|header|true||||||jwt token
 */
@Path("/xml")
public class XMLResource {

	@POST
	@Produces(value = { MediaType.APPLICATION_XML })
	@Consumes(value = { MediaType.APPLICATION_XML })
	@Path("/enrichment")
	public SpatialEnrichmentRS spatialEnrichment(SpatialEnrichmentRQ request) {
		return null;
	}

	@POST
	@Produces(value = { MediaType.APPLICATION_XML })
	@Consumes(value = { MediaType.APPLICATION_XML })
	@Path("/filter-areas")
	public FilterAreasSpatialRS computeAreaFilter(FilterAreasSpatialRQ request) {
		return null;
	}

	@POST
	@Produces(value = { MediaType.APPLICATION_XML })
	@Consumes(value = { MediaType.APPLICATION_XML })
	@Path("/areas-by-location")
	public AreaByLocationSpatialRS getAreasByPoint(AreaByLocationSpatialRQ request) {
		return null;
	}

}