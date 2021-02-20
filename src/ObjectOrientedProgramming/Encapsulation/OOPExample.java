package ObjectOrientedProgramming.Encapsulation;

public class OOPExample 
{
	public static void main (String[] args) 
	{
		Student studentA = new Student("Bob");
		Teacher teacherA = new Teacher("Allan");
		Worker workerA = new Worker("John");
		ComputerScienceStudent csStudentA = new ComputerScienceStudent("Aki");
		
		studentA.speak();
		teacherA.speak();
		workerA.speak();
		csStudentA.speak();
		
		((Person) studentA).introduce();
		((Person) teacherA).introduce();
		((Person) workerA).introduce();
		((Person) csStudentA).introduce();
		
		((Person) studentA).eat();
		((Person) teacherA).eat();
		((Person) workerA).eat();
		((Person) csStudentA).eat();
	}
}
