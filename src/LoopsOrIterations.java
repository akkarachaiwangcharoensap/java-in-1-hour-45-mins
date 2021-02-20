
public class LoopsOrIterations {
	public static void main (String[] args)
	{
		// 1D loop / iteration | performance: O(n^1)
		for (int i = 0; i < 10; i = i + 1)
		{
			System.out.println (i);
		}
		
		System.out.println ("=======================================");
		
		// 2D loop / iteration | performance: O(n^2)
		for (int x = 0; x < 10; x++)
		{
			for (int y = 0; y < 10; y++)
			{
				System.out.println ("x: " + x + " " + "y: " + y);
			}
		}
		
		System.out.println ("=======================================");
		
		// 3D loop / iteration | performance: O(n^3)
		for (int x = 0; x < 10; x++)
		{
			for (int y = 0; y < 10; y++)
			{
				for (int z = 0; z < 10; z++)
				{
					System.out.println ("x: " + x + " " + "y: " + y + " " + "z: " + z);		
				}
			}
		}
	}
}
