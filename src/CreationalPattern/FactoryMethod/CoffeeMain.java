package CreationalPattern.FactoryMethod;

import java.io.*;

public class CoffeeMain {
	public static void main(String[] args) throws IOException
	{
		GetCoffeeFactory coffeeFactory = new GetCoffeeFactory();
		
		System.out.println("Enter the name of coffee for which bill will be generated: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String coffeeName = br.readLine();
		System.out.println("Enter the number of coffee for bill will be calculated: ");
		int units = Integer.parseInt(br.readLine());
		
		Coffee c = coffeeFactory.getCoffee(coffeeName);
		
		System.out.println("Bill amount for " + coffeeName + " of " + units + " units is: ");
			c.getPrice();
			c.calculateBill(units);
	}

}
