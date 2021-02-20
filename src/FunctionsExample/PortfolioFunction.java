package FunctionsExample;

public class PortfolioFunction {
	public static void main (String[] args) {
		PortfolioFunction portfolio = new PortfolioFunction ();
		portfolio.showPortfolio("Aki", new String[] { "Web Development", "Game Development", "Walk", "Speak", "Swim", "Run" },  3);
	}
	
	public void showPortfolio (String name, String[] skills, int yearsOfWorkExperience)
	{
		System.out.println("Hello, my name is " + name);
		System.out.println ("I can do: ");
		for (String skill : skills) {
			System.out.println (skill);
		}
		System.out.println ("I have at least " + yearsOfWorkExperience + " years of experience");
	}
}
