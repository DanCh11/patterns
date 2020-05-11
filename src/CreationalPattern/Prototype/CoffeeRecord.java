package CreationalPattern.Prototype;

class CoffeeRecord implements Prototype {
	private int id;
	private String sort;
	private double price;
	private String address;
	
	public CoffeeRecord() 
	{
		System.out.println(" Coffee Records of NARCOFFEE ");
		System.out.println("----------------------------");
		System.out.println("CId" + "\t" + "Csort" + "\t\t" + "Cprice" + "\t" + "Caddress");
	}
	
	public CoffeeRecord(int id, String sort, double price, String address)
	{
		this();
		this.id = id;
		this.sort = sort;
		this.price = price;
		this.address = address;
	}
	
	public void showRecord()
	{
		System.out.println(id + "\t" + sort + "\t" + price + "\t" + address);
	}
	
	public Prototype getClone()
	{
		return new CoffeeRecord(id, sort, price, address);
	}
}
