package CreationalPattern.Prototype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PrototypeDemo {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter coffee id: ");
		int cid = Integer.parseInt(br.readLine());
		System.out.println("\n");
		
		System.out.println("Enter coffee sort: ");
		String csort = br.readLine();
		System.out.println("\n");
		
		System.out.println("Enter coffee price: ");
		double cprice = Double.parseDouble(br.readLine());
		System.out.println("\n");
		
		System.out.println("Enter where coffee come from: ");
		String caddress = br.readLine();
		System.out.println("\n");
		
		CoffeeRecord c1 = new CoffeeRecord(cid, csort, cprice, caddress);
		c1.showRecord();
		System.out.println("\n");
		CoffeeRecord c2 = (CoffeeRecord) c1.getClone();
		c2.showRecord();
		
		
		
	}
}
