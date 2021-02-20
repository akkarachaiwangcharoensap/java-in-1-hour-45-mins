package ObjectOrientedProgramming.Encapsulation;

public class Teacher extends Person
{
	public Teacher (String name) 
	{
		super(name);
	}
	
	@Override
	public void speak () 
	{
		System.out.println ("I am a teacher!");
	}
}
