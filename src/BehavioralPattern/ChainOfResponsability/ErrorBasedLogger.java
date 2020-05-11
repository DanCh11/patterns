package BehavioralPattern.ChainOfResponsability;

public class ErrorBasedLogger extends logger {
	public ErrorBasedLogger(int levels)
	{
		this.levels = levels;
	}
	
	protected void displayLogInfo(String msg)
	{
		System.out.println("ERROR LOGGER INFO: "+msg); 
	}
}
