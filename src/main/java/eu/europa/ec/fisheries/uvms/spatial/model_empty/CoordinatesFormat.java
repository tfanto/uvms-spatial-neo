package eu.europa.ec.fisheries.uvms.spatial.model_empty;

public enum CoordinatesFormat {

	M("m"), DD("dd"), DMS("dms"), DDM("ddm");
	private final String value;

	CoordinatesFormat(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static CoordinatesFormat fromValue(String v) {
		for (CoordinatesFormat c : CoordinatesFormat.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}