package ObjectOrientedProgramming.Encapsulation;

public class Student extends Person
{
	/**
	 * Student's age
	 */
	private int age;
	
	/**
	 * Student's declared major
	 */
	private String major;
	
	
	/**
	 * Is student poor (yes)
	 */
	private boolean poor;
	
	/**
	 * Is student in STEM?
	 */
	private boolean STEM;
	
	public Student (String name) 
	{
		super(name);
	}
	
	@Override
	public void speak () {
		System.out.println ("I am a student!");
	}
	
	/**
	 * Set age
	 * 
	 * @param int age
	 * @return void
	 */
	public void setAge (int age)
	{
		this.age = age;
	}
	
	/**
	 * Get age
	 * @return int this.age
	 */
	public int getAge () 
	{
		return this.age;
	}
	
	/**
	 * Set major
	 * 
	 * @param String major
	 * @return void
	 */
	public void setMajor (String major)
	{
		this.major = major;
	}
	
	/**
	 * Get major
	 * 
	 * @return String this.major
	 */
	public String getMajor ()
	{
		return this.major;
	}
	
	/**
	 * Set poor
	 * 
	 * @param boolean poor
	 * @return void
	 */
	public void setPoor (boolean poor)
	{
		this.poor = poor;
	}
	
	/**
	 * Is poor
	 * @return boolean this.poor
	 */
	public boolean isPoor ()
	{
		return this.poor;
	}
	
	/**
	 * Set STEM
	 * 
	 * @param boolean STEM
	 * @return void
	 */
	public void setSTEM (boolean STEM)
	{
		this.STEM = STEM;
	}
	
	/**
	 * Is STEM
	 *
	 * @return boolean this.STEM
	 */
	public boolean isSTEM ()
	{
		return this.STEM;
	}
}







