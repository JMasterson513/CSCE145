
public class Apple {
	
	//Instance Variables
	private String type;
	private double weight;
	private double price;
	
	//Default Constructor
	public Apple()
	{
		this.type = "Gala";
		this.weight = 0.5;
		this.price = 0.89;
	}
	
	//Parametrizied constructor for Apple type
	public Apple(String xType, double xWeight, double xPrice)
	{
		this.setType(xType);
		this.setWeight(xWeight);
		this.setPrice(xPrice);
	}
	
	//Accessors for each variable
	public String getType()
	{
		return this.type;
	}
	
	public double getWeight()
	{
		return this.weight;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	//Mutators for each variable
	public void setType(String xType)
	{
		switch(xType)
		{
			case "Red Delicious":
				this.type = xType;
				break;
			case "Golden Delicious":
				this.type = xType;
				break;
			case "Gala":
				this.type = xType;
				break;
			case "Granny Smith":
				this.type = xType;
				break;
			default:
				System.out.println("Invalid Type");
				this.type = "Gala";
				break;
		}
	}
	
	public void setWeight(double xWeight)
	{
		if(xWeight > 0 && xWeight < 2)
		{
			this.weight = xWeight;
		}
		
		else
		{
			System.out.println("Invalid Weight");
			this.weight = 0.5;
		}
	}
	
	public void setPrice(double xPrice)
	{
		if(xPrice > 0)
		{
			this.price = xPrice;
		}
		
		else
		{
			System.out.println("Invalid Price");
			this.price = 0.89;
		}
	}
	
	public String toString()
	{
		return "Type: " + type + "\nWeight: " + weight + "kg\nPrice: $" + price;
	}
	
}
