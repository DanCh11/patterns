package StructuralPattern.DecoratorPattern;
import java.io.*;

public class decoratorPatternDemo {
	private static int choice;
	
	public static void main(String[] args) throws IOException, NumberFormatException
	{
		do
		{
	        System.out.print("========= Coffee Menu ============ \n");  
	        System.out.print("       1. Decaf Coffee.          \n");  
	        System.out.print("       2. Coffee with CBD.       \n");  
	        System.out.print("       3. Special Edition Coffee.\n");  
	        System.out.print("       4. Exit                   \n");  
	        System.out.print("Enter your choice: "); 
	        
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        choice = Integer.parseInt(br.readLine());
	        
	        switch (choice)
	        {
	        case 1:
	        {
	        	DecafCoffee dc = new DecafCoffee();
	        	System.out.println(dc.prepareCoffee());
	        	System.out.println(dc.price());
	        }
	        break;
	        
	        case 2:
	        {
	        	Coffee c1 = new cbdCoffee((Coffee) new DecafCoffee());
	        	System.out.println(c1.prepareCoffee());
	        	System.out.println(c1.price());
	        }
	        break;
	        
	        case 3:
	        {
	        	Coffee c2 = new seCoffee((Coffee) new DecafCoffee());
	        	System.out.println(c2.prepareCoffee());
	        	System.out.println(c2.price());
	        }
	        break;
	        
	        default:
	        {
	        	System.out.println("Other than these are comming soon. . .");
	        }
	        return;
	        }
		}
		while(choice != 4);
	}
}
