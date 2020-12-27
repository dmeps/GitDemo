package beta;

import org.apache.logging.log4j.*;

public class DemoB {
	
	private static Logger log = LogManager.getLogger(DemoB.class.getName()); //accepts the class argument
	
	public static void main(String[] args) {
		log.debug("Button is clicked");
		log.error("Button is not present");
		log.info("Button is displayed");
		log.fatal("Button is missing");
	}

}
