package eu.europa.ec.fisheries.uvms.spatial.rest.resources.secured;

import java.io.IOException;

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
import eu.europa.ec.fisheries.uvms.spatial.model_empty.ConfigResourceDto;
import eu.europa.ec.fisheries.uvms.spatial.model_empty.ConfigurationDto;
import eu.europa.ec.fisheries.uvms.spatial.rest.resources.UnionVMSResource;

/**
 * @implicitParam roleName|string|header|true||||||
 * @implicitParam scopeName|string|header|true|EC|||||
 * @implicitParam authorization|string|header|true||||||jwt token
 */
@Path("/config")
public class ConfigResource extends UnionVMSResource {

	private static final String DEFAULT_CONFIG = "DEFAULT_CONFIG";
	private static final String USER_CONFIG = "USER_CONFIG";

	@POST
	@Produces(value = { MediaType.APPLICATION_JSON })
	@Consumes(value = { MediaType.APPLICATION_JSON })
	@Path("{id}")
	public Response getReportMapConfig(@PathParam("id") int id, ConfigResourceDto config, @HeaderParam("roleName") String roleName, @HeaderParam("scopeName") String scopeName, @Context HttpServletRequest servletRequest) {
		return null;
	}

	@GET
	@Produces(value = { MediaType.APPLICATION_JSON })
	@Path("/basic")
	public Response getBasicReportMapConfig(@HeaderParam("roleName") String roleName, @HeaderParam("scopeName") String scopeName, @Context HttpServletRequest servletRequest) {
		return null;
	}

	@POST
	@Produces(value = { MediaType.APPLICATION_JSON })
	@Consumes(value = { MediaType.APPLICATION_JSON })
	@Path("/fromreport")
	public Response getReportMapConfigWithoutSave(ConfigurationDto configurationDto, @HeaderParam("roleName") String roleName, @HeaderParam("scopeName") String scopeName, @Context HttpServletRequest servletRequest) {
		return null;
	}

	@GET
	@Produces(value = { MediaType.APPLICATION_JSON })
	@Path("/report")
	public Response getReportConfig(@HeaderParam("roleName") String roleName, @HeaderParam("scopeName") String scopeName, @Context HttpServletRequest servletRequest) {
		return null;
	}

	@GET
	@Produces(value = { MediaType.APPLICATION_JSON })
	@Path("/admin")
	public Response getAdminPreferences(@HeaderParam("roleName") String roleName, @HeaderParam("scopeName") String scopeName, @Context HttpServletRequest servletRequest) {
		return null;
	}

	@POST
	@Consumes(value = { MediaType.APPLICATION_JSON })
	@Produces(value = { MediaType.APPLICATION_JSON })
	@Path("/admin/save")
	public Response saveAdminPreferences(ConfigurationDto configurationDto, @HeaderParam("roleName") String roleName, @HeaderParam("scopeName") String scopeName, @Context HttpServletRequest servletRequest) throws IOException {
		return null;
	}

	@GET
	@Produces(value = { MediaType.APPLICATION_JSON })
	@Path("/user")
	public Response getUserPreferences(@HeaderParam("roleName") String roleName, @HeaderParam("scopeName") String scopeName, @Context HttpServletRequest servletRequest) throws  IOException {
		return null;
	}

	@POST
	@Consumes(value = { MediaType.APPLICATION_JSON })
	@Produces(value = { MediaType.APPLICATION_JSON })
	@Path("/user/save")
	public Response saveUserPreferences(@Context HttpServletRequest request, @HeaderParam(AuthConstants.HTTP_HEADER_SCOPE_NAME) String scopeName, @HeaderParam(AuthConstants.HTTP_HEADER_ROLE_NAME) String roleName,
			ConfigurationDto configurationDto) throws  IOException {
		return null;
	}

	@POST
	@Consumes(value = { MediaType.APPLICATION_JSON })
	@Produces(value = { MediaType.APPLICATION_JSON })
	@Path("/user/reset")
	public Response resetUserPreferences(ConfigurationDto configurationDto, @HeaderParam("roleName") String roleName, @HeaderParam("scopeName") String scopeName, @Context HttpServletRequest servletRequest)  {
		return null;
	}

	@GET
	@Produces(value = { MediaType.APPLICATION_JSON })
	@Path("/projections")
	public Response getAllProjections() {
		return null;
	}
}