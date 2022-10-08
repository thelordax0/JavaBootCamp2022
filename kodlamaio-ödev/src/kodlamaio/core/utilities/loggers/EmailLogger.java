package kodlamaio.core.utilities.loggers;

public class EmailLogger implements Logger{

	@Override
	public void log(String mesaj) {
		System.out.println("Email loglandı "+mesaj);
		
	}

}
