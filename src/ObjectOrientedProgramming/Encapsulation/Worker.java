package ObjectOrientedProgramming.Encapsulation;

public class Worker extends Person
{
	public Worker (String name) 
	{
		super(name);
	}
	
	@Override
	public void speak () {
		System.out.println ("I am a worker!");
	}
}
