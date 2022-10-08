package kodlamaio.bussiness.concretes;

import kodlamaio.core.utilities.loggers.Logger;

public class LogManager {
	private Logger logger;

	public LogManager(Logger logger) {
		super();
		this.logger = logger;
	}
	
	public void log(String mesaj) {
		logger.log(mesaj);
	}
	
}
