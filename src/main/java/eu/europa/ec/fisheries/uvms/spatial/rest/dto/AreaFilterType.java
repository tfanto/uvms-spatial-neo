package eu.europa.ec.fisheries.uvms.spatial.rest.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class AreaFilterType extends FilterType {

	@NotNull
	@NotEmpty
	private String areaType;

	public AreaFilterType(String filter, String areaType) {
		super(filter);
		this.areaType = areaType;
	}

	public AreaFilterType(String areaType) {
		super("");
		this.areaType = areaType;
	}

	public String getAreaType() {
		return areaType;
	}

	public void setAreaType(String areaType) {
		this.areaType = areaType;
	}
}