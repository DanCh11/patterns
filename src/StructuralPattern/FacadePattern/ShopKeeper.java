package StructuralPattern.FacadePattern;

public class ShopKeeper 
{
	private CoffeeShop Americano;
	private CoffeeShop Espresso;
	private CoffeeShop FlatWhite;
	
	public ShopKeeper()
	{
		Americano = new Americano();
		Espresso = new Espresso();
		FlatWhite = new FlatWhite();
	}
	
	public void AmericanoSales()
	{
		Americano.sortNo();
		Americano.price();
	}
	
	public void EspressoSales()
	{
		Espresso.sortNo();
		Espresso.price();
	}
	
	public void FlatWhiteSales()
	{
		FlatWhite.sortNo();
		FlatWhite.price();
	}

}
