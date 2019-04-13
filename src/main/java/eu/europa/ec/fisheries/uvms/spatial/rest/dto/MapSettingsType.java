package eu.europa.ec.fisheries.uvms.spatial.rest.dto;

import eu.europa.ec.fisheries.uvms.spatial.model_empty.CoordinatesFormat;
import eu.europa.ec.fisheries.uvms.spatial.model_empty.MapConfigurationType;
import eu.europa.ec.fisheries.uvms.spatial.model_empty.ScaleBarUnits;

public class MapSettingsType {

	private MapConfigurationType mapConfigurationType;

	public MapSettingsType(MapConfigurationType mapConfigurationType) {
		this.mapConfigurationType = mapConfigurationType;
	}

	public interface Exclude {
		CoordinatesFormat getCoordinatesFormat();

		ScaleBarUnits getScaleBarUnits();
	}

	public String getCoordinatesFormat() {

		return mapConfigurationType.getCoordinatesFormat().value().toLowerCase();

	}

	public String getScaleBarUnits() {

		return mapConfigurationType.getScaleBarUnits().value().toLowerCase();

	}
}