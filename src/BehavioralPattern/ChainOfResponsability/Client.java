package BehavioralPattern.ChainOfResponsability;

public class Client {
	private static logger doChaining()
	{
		logger consoleLogger = new ConsoleBasedLogger(logger.OUTPUTINFO);
		logger errorLogger = new ErrorBasedLogger(logger.ERRORINFO);
		consoleLogger.setNextLevelLogger(errorLogger);
		
		logger debugLogger = new DebugBasedLogger(logger.DEBUGINFO);
		errorLogger.setNextLevelLogger(debugLogger);
		
		return consoleLogger;
	}
	
	public static void main(String[] args)
	{
		logger chainLogger = doChaining();
		
        chainLogger.logMessage(logger.OUTPUTINFO, "Enter the nr. of your command ");  
        chainLogger.logMessage(logger.ERRORINFO, "An error is occured now");  
        chainLogger.logMessage(logger.DEBUGINFO, "This was the error now debugging is compeled"); 
	}
	
	

}
