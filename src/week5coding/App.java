package week5coding;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = new AsteriskLogger();  
		
		Logger slogger = new SpacedLogger();
		
		logger.Log("Hello");  
		
		
		logger.Error("Hello"); 
		
		slogger.Log("Hello"); 
		
		slogger.Error("Hello");
		
		
	}

}
