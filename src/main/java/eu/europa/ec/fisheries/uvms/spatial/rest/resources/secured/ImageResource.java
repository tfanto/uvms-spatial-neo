package eu.europa.ec.fisheries.uvms.spatial.rest.resources.secured;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import eu.europa.ec.fisheries.uvms.spatial.model_empty.Icons;
import eu.europa.ec.fisheries.uvms.spatial.model_empty.ImageResponse;
import eu.europa.ec.fisheries.uvms.spatial.rest.resources.UnionVMSResource;

/**
 * @implicitParam roleName|string|header|true||||||
 * @implicitParam scopeName|string|header|true|EC|||||
 * @implicitParam authorization|string|header|true||||||jwt token
 */
@Path("/image")
public class ImageResource extends UnionVMSResource {

	public static final String SCALE_1_3 = "scale(1.3)";
	public static final String SCALE_0_3 = "scale(0.3)";

	@Path("/position")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listPositionEntryKeys() throws IOException {
		return null;
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response renderImages(@Context HttpServletRequest request, Icons payload) {
		return null;
	}

	private void handleAlarms(Icons payload, ImageResponse response) {
	}

	private void handlePositions(Icons payload, ImageResponse response) {
	}

	private void handleSegments(Icons payload, ImageResponse response) {
	}

}