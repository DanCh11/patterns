package CreationalPattern.FactoryMethod;


class GetCoffeeFactory
{
	public Coffee getCoffee(String coffeeType)
	{
		if(coffeeType == null)
		{
			return null;
		}
		if(coffeeType.equalsIgnoreCase("AMERICANO"))
		{
			return new Americano();
		}
		else if(coffeeType.equalsIgnoreCase("ESPRESSO"))
		{
			return new Espresso();
		}
		else if(coffeeType.equalsIgnoreCase("LONGBLACK"))
		{
			return new LongBlack();
		}
	return null;
	}
}// end of GetCoffeeFactory class

