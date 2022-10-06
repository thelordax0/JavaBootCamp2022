package youtubeEğitim;

public class LogManager{

	private Logger logger;
	
	
	public LogManager(Logger logger) {
		this.logger=logger;
	}
	
	
	
	public void log() {
		
		logger.log();
	}
	
}
