package fnt.sys;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.neo4j.graphdb.GraphDatabaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebListener
public class AppServletContextListener implements ServletContextListener {

	private static Logger LOG = LoggerFactory.getLogger(AppServletContextListener.class);

	private static GraphDatabaseService db = null;

	public static GraphDatabaseService getDB() {
		return db;
	}

	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		LOG.info("---------------------------------------------------------->>> contextInitialized");
		Neo neo = new Neo();		
		db = neo.openNeo();
		neo.setDb(db);
		neo.setupNeo();

	}

	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		LOG.info("---------------------------------------------------------->>> contextDestroyed");
		Neo neo = new Neo();		
		if (db != null) {
			neo.closeNeo(db);

		}

	}

}
