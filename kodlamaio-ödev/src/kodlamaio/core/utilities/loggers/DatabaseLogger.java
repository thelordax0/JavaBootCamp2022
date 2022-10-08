package kodlamaio.core.utilities.loggers;

public class DatabaseLogger implements Logger{

	@Override
	public void log(String mesaj) {
		System.out.println("Database loglandı "+mesaj);
		
	}

}
