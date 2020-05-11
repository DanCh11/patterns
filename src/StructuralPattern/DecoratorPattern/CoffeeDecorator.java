package StructuralPattern.DecoratorPattern;

public abstract class CoffeeDecorator implements Coffee 	
{
	private Coffee newCoffee;
	public CoffeeDecorator(Coffee newCoffee)
	{
		this.newCoffee = newCoffee;
	}
	
	public String prapareCoffee()
	{
		return newCoffee.prepareCoffee();
	}
	
	public double price()
	{
		return newCoffee.price();
	}
}
