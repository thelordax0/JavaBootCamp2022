package kodlamaio.core.utilities.loggers;

public class FileLogger implements Logger{

	@Override
	public void log(String mesaj) {
		System.out.println("Dosyaya loglandı "+mesaj);
		
	}

}
