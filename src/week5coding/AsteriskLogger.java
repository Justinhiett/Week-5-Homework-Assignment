package week5coding;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String str) {
		// TODO Auto-generated method stub
		System.out.println("***" + str + "***");
	}

	@Override
	public void Error(String str) {
		// TODO Auto-generated method stub 
		System.out.println("****************"); 
		System.out.println("***Error: " + str + "***"); 
		System.out.println("****************"); 
		
		
		
	} 
	

}
