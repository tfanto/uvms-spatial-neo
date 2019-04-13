package fnt.sys;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.ext.Provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

@PreMatching
@Provider
public class AppRequestFilter implements ContainerRequestFilter {
	
	private static Logger LOG = LoggerFactory.getLogger(AppRequestFilter.class);


	private static final ObjectMapper MAPPER = new ObjectMapper();
	private static final String TRANSACTION_ID = "TRANSID";

	@Context
	UriInfo uriInfo;

	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {
		
		LOG.info("---------------------------------------------------------------------------------    >>>>   IN REQUESTFILTER");		

	}
}
