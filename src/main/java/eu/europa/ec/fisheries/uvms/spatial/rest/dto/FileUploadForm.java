package eu.europa.ec.fisheries.uvms.spatial.rest.dto;

import javax.validation.constraints.NotEmpty;
import javax.ws.rs.FormParam;

public class FileUploadForm {

	private int crsCode;
	@NotEmpty
	private String areaType;
	@NotEmpty
	private byte[] data;

	public int getCrsCode() {
		return crsCode;
	}

	@FormParam("crs")
	public void setCrsCode(int crsCode) {
		this.crsCode = crsCode;
	}

	public String getAreaType() {
		return areaType;
	}

	@FormParam("areaType")
	public void setAreaType(String areaType) {
		this.areaType = areaType;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}
}