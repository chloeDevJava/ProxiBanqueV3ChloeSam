package org.formation.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLog {

	private static final Logger LOGGER = LoggerFactory.getLogger(TestLog.class);
	
	public static void main(String[] args) {
				
		LOGGER.error("ERREUR !");
		LOGGER.warn("WARN !");
		LOGGER.info("INFO !");
		LOGGER.debug("DEBUG !");
		LOGGER.trace("TRACE !");
		
		
		// QUAND ON RUN CA AFFICHE QUE ERROR WARN ET INFO, CAR 

	}


}