package eu.europa.ec.fisheries.uvms.spatial.rest.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class AreaCoordinateType extends GeoCoordinateType {

	@NotEmpty
	private String areaType;

	@NotNull
	private Boolean isGeom = false;

	protected void setAreaType(String type) {
		areaType = type;
	}
}