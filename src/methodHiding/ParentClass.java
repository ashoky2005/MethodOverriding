package methodHiding;

public class ParentClass 
{
	
	// Program 1: - Here we can see difference bw Overriding & Hiding
	
	public static void m1()

	{
		System.out.println("Parent");
	}
	

	//  Program 2
	

	public static void disp()
	{
		System.out.println("Sataic Method 1");
	}
	
	public void print()
	{
		System.out.println("Non Static Method 1");
	}
	
}
