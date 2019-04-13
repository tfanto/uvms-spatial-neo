package eu.europa.ec.fisheries.uvms.spatial.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GeoCoordinateType {

	protected String id;

	protected Double longitude;

	protected Double latitude;

	protected Integer crs;

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("gid")
	public String getGid() {
		return id;
	}

	@JsonProperty("gid")
	public void setGid(String gid) {
		this.id = gid;
	}

}