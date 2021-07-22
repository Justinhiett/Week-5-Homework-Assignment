package week5coding;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String str) {
		// TODO Auto-generated method stub
		String newStr = str.replace("", " ").trim(); 
		
		System.out.println(newStr);
			
		
	}

	@Override
	public void Error(String str) {
		// TODO Auto-generated method stub
		String newStr = str.replace("", " ").trim(); 
		
		System.out.println("ERROR: " + newStr);
	} 
	
	
}
