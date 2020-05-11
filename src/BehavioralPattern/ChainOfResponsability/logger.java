package BehavioralPattern.ChainOfResponsability;

public abstract class logger {
	public static int OUTPUTINFO = 1;
	public static int ERRORINFO = 2;
	public static int DEBUGINFO = 3;
	
	protected int levels;
	protected logger nextLevelLogger;
	public void setNextLevelLogger(logger nextLevelLogger)
	{
		this.nextLevelLogger = nextLevelLogger;
	}
	
	public void logMessage(int levels, String msg)
	{
		if(this.levels <= levels)
		{
			displayLogInfo(msg);
		}
		if (nextLevelLogger != null)
		{
			nextLevelLogger.logMessage(levels, msg);
		}
	}
	
	protected abstract void displayLogInfo(String msg);
}
