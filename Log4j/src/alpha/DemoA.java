package alpha;

import org.apache.logging.log4j.*;

public class DemoA {
	
	private static Logger log = LogManager.getLogger(DemoA.class.getName()); //accepts the class argument
	
	public static void main(String[] args) {
		log.debug("debug");
		log.error("error");
		log.info("info");
		log.fatal("fatal");
	}

}
