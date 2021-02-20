package ObjectOrientedProgramming.Encapsulation;

public abstract class Person implements Hunger
{
	private String name;
	
	public Person (String name) 
	{
		this.setName(name);
	}
	
	public void eat () 
	{
		System.out.println ("I am eating.");
	}
	
	public void introduce ()
	{
		System.out.println ("Hello there, I am " + this.getName());
	}
	
	public void speak () 
	{
		System.out.println("A person can speak eh?");
	}
	
	/**
	 * Set name
	 * 
	 * @param String name
	 * @return void
	 */
	public void setName (String name)
	{
		this.name = name;
	}
	
	/**
	 * Get name
	 * @return String this.getName
	 */
	public String getName ()
	{
		return this.name;
	}
}
