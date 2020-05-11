package StructuralPattern.DecoratorPattern;

public class cbdCoffee extends CoffeeDecorator {
	public cbdCoffee(Coffee newCoffee)
	{
		super(newCoffee);
	}
	
	public String prepareCoffee()
	{
		return super.prapareCoffee() + " Added with low quantity of CBD ";
	}
	
	public double price()
	{
		return super.price() + 10.00;
	}
}
	
