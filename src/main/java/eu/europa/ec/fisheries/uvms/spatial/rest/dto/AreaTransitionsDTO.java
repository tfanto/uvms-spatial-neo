package eu.europa.ec.fisheries.uvms.spatial.rest.dto;

import java.util.List;

import eu.europa.ec.fisheries.uvms.spatial.model_empty.AreaExtendedIdentifierType;
import eu.europa.ec.fisheries.uvms.spatial.model_empty.SpatialEnrichmentRS;

public class AreaTransitionsDTO {

	List<AreaExtendedIdentifierType> enteredAreas;
	List<AreaExtendedIdentifierType> exitedAreas;
	SpatialEnrichmentRS spatialEnrichmentRS;

	public List<AreaExtendedIdentifierType> getEnteredAreas() {
		return enteredAreas;
	}

	public void setEnteredAreas(List<AreaExtendedIdentifierType> enteredAreas) {
		this.enteredAreas = enteredAreas;
	}

	public List<AreaExtendedIdentifierType> getExitedAreas() {
		return exitedAreas;
	}

	public void setExitedAreas(List<AreaExtendedIdentifierType> exitedAreas) {
		this.exitedAreas = exitedAreas;
	}

	public SpatialEnrichmentRS getSpatialEnrichmentRS() {
		return spatialEnrichmentRS;
	}

	public void setSpatialEnrichmentRS(SpatialEnrichmentRS spatialEnrichmentRS) {
		this.spatialEnrichmentRS = spatialEnrichmentRS;
	}
}
