package BehavioralPattern.ChainOfResponsability;

public class ConsoleBasedLogger extends logger {
	public ConsoleBasedLogger(int levels)
	{
		this.levels = levels;
	}
	
	protected void displayLogInfo(String msg)
	{
		System.out.println("CONSOLE LOGGER INFO: "+msg); 
	}
}
