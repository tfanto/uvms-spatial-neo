package eu.europa.ec.fisheries.uvms.spatial.rest.dto;

import eu.europa.ec.fisheries.uvms.spatial.service.enums.SpatialTypeEnum;

public class UserAreaCoordinateType extends AreaCoordinateType {

	public UserAreaCoordinateType() {
		super.setAreaType(SpatialTypeEnum.USERAREA.getType());
	}

}