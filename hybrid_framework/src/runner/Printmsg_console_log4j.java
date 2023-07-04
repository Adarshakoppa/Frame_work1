package runner;

import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;

import freemarker.log.Logger;

public class Printmsg_console_log4j 
{
	@Test
	private void te2() 
	{
		//step1
		BasicConfigurator.configure();
		//step2
		Logger log=Logger.getLogger(this.getClass().getName());
		//step3
		log.error("error");
		log.info("info");
		

	}

}
