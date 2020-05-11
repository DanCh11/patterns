package StructuralPattern.DecoratorPattern;

public class seCoffee extends CoffeeDecorator {
	public seCoffee(Coffee newCoffee)
	{
		super(newCoffee);
	}
	
	public String prepareCoffee()
	{
		return super.prapareCoffee() + " with 2 drops of whilky honey ";
	}
	
	public double price()
	{
		return super.price() + 15.00;
	}
}
