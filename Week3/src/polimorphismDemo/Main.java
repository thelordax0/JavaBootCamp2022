package polimorphismDemo;

public class Main {

	public static void main(String[] args) {
//		//Baselogger miras verdiği sınıfların referansını tutabilir. 
//		BaseLogger[] loggers= {new DatabaseLogger(),new FileLogger(),new EmailLogger(),new ConsoleLogger()};
//		//Polimorfizm base sınıflar ve interfaceler le yapılabilir.
//		for (BaseLogger logger : loggers) {
//			logger.log(" veri");
//		}
		
		
		CustomerManager cm=new CustomerManager(new DatabaseLogger());
		
		cm.add();
		
		
		
	}

}
