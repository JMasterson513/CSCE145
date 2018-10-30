public class Coffee {
	
	//Instance variables
	private String name;
	private int caffContent;
	
	//Default constructor
	public Coffee()
	{
		this.name = "No Name Yet";
		this.caffContent = 0;
	}
	
	//Parameterized constructor
	public Coffee(String xName, int xCaffContent)
	{
		this.setName(xName);
		this.setCaffContent(xCaffContent);
	}
	
	//Accessor for name
	/**
	 * Pre-Condition: an instance of the coffee name must be available
	 * Post-Condition: the instace of the coffee name is returned
	 * @return instance of coffee name
	 * @param no parameters
	 */
	public String getName()
	{
		return this.name;
	}
	
	//Accessor for caffeine content
	/**
	 * Pre-Condition: An instance of caffeine content must be available
	 * Post-Condition: the instance of caffeine content is returned
	 * @return instance of caffeine content
	 * @param no parameters
	 */
	public int getCaffContent()
	{
		return this.caffContent;
	}
	
	//Mutator for name
	
	/**
	 * Pre-Condition: the name of the coffee must be available
	 * Post-Condition: the instance of the name of the coffee is updated
	 * @param xName
	 */
	public void setName(String xName)
	{
		this.name = xName;
	}
	
	//Mutator for caffContent
	/**
	 * Pre-Condition: the amount of caffeine in the coffee must be available
	 * Post-Condition: the instance of the caffeine content is updated
	 * @param xCaffContent
	 */
	public void setCaffContent(int xCaffContent)
	{
		if(xCaffContent >= 50 && xCaffContent <= 300)
		{
			this.caffContent = xCaffContent;
		}
		
		else
		{
			System.out.println("Unvalid amount of caffenine entered");
			System.exit(0);
		}

	}
	
	public String RiskyAmount()
	{
		double cupsAmount = 180 / ((caffContent / 100.0) * 6);
		return "It would take " + cupsAmount + " cups of " + name + " before it\'s dangerous to drink more.";
	}
	
}
