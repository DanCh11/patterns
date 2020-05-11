package BehavioralPattern.ChainOfResponsability.IteratorPattern;

public class IteratorPatternDemo {
	public static void main(String[] args)
	{
		CollectionOfSorts c = new CollectionOfSorts();
		
		for (Iterator iter = c.getIterator(); iter.hasNext();)
		{
			String name = (String)iter.next();
			System.out.println("Name : " + name); 
		}
	}
}
