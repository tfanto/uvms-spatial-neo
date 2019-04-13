package eu.europa.ec.fisheries.uvms.spatial.rest.resources;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import eu.europa.ec.fisheries.uvms.spatial.rest.resources.secured.AreaResource;
import eu.europa.ec.fisheries.uvms.spatial.rest.resources.secured.BookmarkResource;
import eu.europa.ec.fisheries.uvms.spatial.rest.resources.secured.ConfigResource;
import eu.europa.ec.fisheries.uvms.spatial.rest.resources.secured.CountryResource;
import eu.europa.ec.fisheries.uvms.spatial.rest.resources.secured.FileUploadResource;
import eu.europa.ec.fisheries.uvms.spatial.rest.resources.secured.GeometryUtilsResource;
import eu.europa.ec.fisheries.uvms.spatial.rest.resources.secured.ImageResource;
import eu.europa.ec.fisheries.uvms.spatial.rest.resources.secured.MapConfigResource;
import eu.europa.ec.fisheries.uvms.spatial.rest.resources.secured.ServiceLayerResource;
import eu.europa.ec.fisheries.uvms.spatial.rest.resources.secured.UserAreaResource;
import eu.europa.ec.fisheries.uvms.spatial.rest.resources.secured.XMLResource;
import eu.europa.ec.fisheries.uvms.spatial.rest.resources.unsecured.LegendResource;
import eu.europa.ec.fisheries.uvms.spatial.rest.resources.unsecured.PositionResource;
import eu.europa.ec.fisheries.uvms.spatial.rest.resources.unsecured.SpatialRestResource;
import fnt.sys.AppRequestFilter;
import fnt.sys.AppResponseFilter;

public class RestActivatorSpatial extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> set = new HashSet<>();
		// resources.add(ObjectMapperContextResolver.class);

		set.add(AppRequestFilter.class);
		set.add(AppResponseFilter.class);

		set.add(SpatialRestResource.class);
		set.add(LegendResource.class);
		set.add(PositionResource.class);
		set.add(AreaResource.class);
		set.add(XMLResource.class);
		set.add(ConfigResource.class);
		set.add(UserAreaResource.class);
		set.add(CountryResource.class);
		set.add(MapConfigResource.class);
		set.add(FileUploadResource.class);
		set.add(BookmarkResource.class);
		set.add(ImageResource.class);
		set.add(ServiceLayerResource.class);
		set.add(GeometryUtilsResource.class);

		return set;
	}

}
