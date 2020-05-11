package CreationalPattern.FactoryMethod;

//import CreationalPattern.Coffee;
import java.io.*;

abstract class Coffee
{
	protected double price;
	abstract void getPrice();
	
	public void calculateBill(int units)
	{
		System.out.println(units*price);
	}
} 

class Americano extends Coffee
{
	public void getPrice()
	{	
		price = 12.50;
	}
}


class Espresso extends Coffee
{
	public void getPrice()
	{
		price = 14.50;
	}
}


class LongBlack extends Coffee
{
	public void getPrice()
	{
		price = 17.50;
	}
} 


