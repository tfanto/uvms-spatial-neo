package eu.europa.ec.fisheries.uvms.spatial.rest.resources.unsecured;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;

@Path("/position")
@SuppressWarnings("unchecked")
public class PositionResource {

	private static final Map<String, BufferedImage> positionEntries = Collections.synchronizedMap(new LinkedHashMap() {

		private static final int MAX_ENTRIES = 1000;

		@Override
		protected boolean removeEldestEntry(Map.Entry eldest) {

			return size() > MAX_ENTRIES;
		}
	});

	public static Map<String, BufferedImage> getpositionEntries() {
		return positionEntries;
	}

	@GET
	@Path("/{key}")
	public void getPositionEntry(@PathParam("key") String key, @Context HttpServletResponse response) throws IOException {
		BufferedImage bi = positionEntries.get(key);
		if (bi != null) {
			OutputStream out = response.getOutputStream();
			ImageIO.write(bi, "png", out);
			out.close();
		}
	}

}