package eu.europa.ec.fisheries.uvms.spatial.model_empty;

public enum ScaleBarUnits {

	METRIC("metric"), DEGREES("degrees"), NAUTICAL("nautical"), IMPERIAL("imperial");
	private final String value;

	ScaleBarUnits(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static ScaleBarUnits fromValue(String v) {
		for (ScaleBarUnits c : ScaleBarUnits.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
