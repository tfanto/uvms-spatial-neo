
package eu.europa.ec.fisheries.uvms.spatial.rest.resources.unsecured;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/health")
public class HealthActivator extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new HashSet<>();
		resources.add(HealthResource.class);
		return resources;
	}
}