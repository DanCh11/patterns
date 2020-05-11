package StructuralPattern.DecoratorPattern;

public class DecafCoffee implements Coffee {
	public String prepareCoffee()
	{
		return "Decaf Coffee";
	}
	
	public double price()
	{
		return 25.00;
	}
}
