package eu.europa.ec.fisheries.uvms.spatial.rest;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import eu.europa.ec.fisheries.uvms.spatial.rest.resources.RestActivatorSpatial;
import fnt.sys.AppServletContextListener;


public class WebApp {

	public static void main(String[] args) throws Exception {
		ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
		context.setContextPath("/");

		AppServletContextListener contextListener = new AppServletContextListener();
		context.addEventListener(contextListener);

		Server jettyServer = new Server(8080);
		// HandlerList handlers = new HandlerList();
		
		jettyServer.setHandler(context);

		ServletHolder jerseyServlet = context.addServlet(org.glassfish.jersey.servlet.ServletContainer.class, "/*");
		jerseyServlet.setInitOrder(0);

		jerseyServlet.setInitParameter("javax.ws.rs.Application", RestActivatorSpatial.class.getCanonicalName());

		try {
			jettyServer.start();
			jettyServer.join();
		} finally {
			jettyServer.destroy();
		}
	}
}
