package fnt;

import org.neo4j.gis.spatial.SpatialDatabaseRecord;

public class Line_GFCM {
	
		
	public String SRID = null;
	public String geometry = null;
	public String name = null;
	public String code = null;
	public Boolean enabled = null;
	
	public SpatialDatabaseRecord spatialDatabaseRecord = null;
	

	
	
	
	@Override
	public String toString() {
		return "Line_GFCM [SRID=" + SRID + ", geometry=" + geometry + ", name=" + name + ", code=" + code + ", enabled="
				+ enabled + "]";
	}
	
	
	
	
	
}