package ObjectOrientedProgramming.Encapsulation;

public final class ComputerScienceStudent extends Student 
{
	public ComputerScienceStudent (String name)
	{
		super(name);
	}
	
	@Override
	public void speak () {
		System.out.println ("I am a Computer Science student!");
	}
}
