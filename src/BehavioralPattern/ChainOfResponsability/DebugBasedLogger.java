package BehavioralPattern.ChainOfResponsability;

public class DebugBasedLogger extends logger {
	public DebugBasedLogger(int levels)
	{
		this.levels = levels;
	}
	
	protected void displayLogInfo(String msg)
	{
		System.out.println("DEBUG LOGGER INFO: "+msg);  
	}
}
