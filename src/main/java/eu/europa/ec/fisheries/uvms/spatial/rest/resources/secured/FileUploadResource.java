package eu.europa.ec.fisheries.uvms.spatial.rest.resources.secured;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import eu.europa.ec.fisheries.uvms.spatial.model_empty.UploadMapping;
import eu.europa.ec.fisheries.uvms.spatial.rest.dto.FileUploadForm;
import eu.europa.ec.fisheries.uvms.spatial.rest.resources.UnionVMSResource;

/**
 * @implicitParam roleName|string|header|true||||||
 * @implicitParam scopeName|string|header|true|EC|||||
 * @implicitParam authorization|string|header|true||||||jwt token
 */
@Path("/files")
public class FileUploadResource extends UnionVMSResource {

	@POST
	@Produces(value = { MediaType.APPLICATION_JSON })
	@Consumes(value = { MediaType.APPLICATION_JSON })
	@Path("/upload/{type}/{code}")
	public Response upload(UploadMapping mapping, @PathParam("type") String type, @PathParam("code") int code) {

		return null;
	}

	@POST
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@Produces(value = { MediaType.APPLICATION_JSON })
	@Path("/metadata")
	// public Response metadata(@MultipartForm FileUploadForm form) throws
	// ServiceException {
	public Response metadata(FileUploadForm form) {
		return null;
	}
}