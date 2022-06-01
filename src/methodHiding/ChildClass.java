package methodHiding;

public class ChildClass extends ParentClass
{
	public static void m1()
	
	{
		System.out.println("Child");
	}
	
	public static void main(String[] args) 
	{
		
		ChildClass r = new ChildClass();
		r.m1();
		
		
		ParentClass y = new ParentClass();
		y.m1();
		
		ParentClass x = new ChildClass(); 
		x.m1();

	}}
		
/*  Here output should be print "Child" but we know that in static method
		    resolution always based on reference type under by compiler.
		    
		    if there is non static methods in both class then method resolution always 
		    based on run type object
		 */
		

                   // Program 2

//public class ChildClass extends ParentClass
//{
//	public static void disp()
//	{
//		System.out.println("Static Method 2");
//	}
//	
//	
//	public void print()
//	{
//		System.out.println("Non Static method 2");
//	}
//	
//	
//	public static void main(String[] args) 
//	{
//		ParentClass r = new ChildClass();
//		r.disp();
//		r.print();
//		
//		ChildClass x = new ChildClass();
//		x.disp();
//		x.print();
//	}}









	
	

