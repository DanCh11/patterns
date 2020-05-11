package BehavioralPattern.ChainOfResponsability.IteratorPattern;

public class CollectionOfSorts implements Container {
	public String name[] = {"Americano", "Long Black", "Latte", "Vanilliacino", "Flat White", "Cappucino"};
	
	public Iterator getIterator()
	{
		return new CollectionOfSortsIterate();
	}
	
	private class CollectionOfSortsIterate implements Iterator 
	{
		int i;
		
		public boolean hasNext()
		{
			if (i<name.length)
			{
				return true;
			}
			return false;
		}
		
		public Object next()
		{
			if (this.hasNext())
			{
				return name[i++];
			}
			return null;
		}
	}

}
