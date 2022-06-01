package packageA;

public class ThisKeyword 
{
//  This Keywords Program
//	
//int i;
//void setvaluex(int x)
//{
//	i=x;
//}
//void show ()
//{
//	System.out.println(i);
//}
//
//
//  public static void main(String[] args)
//  {
//	
//
//	  ThisKeyword r = new ThisKeyword();
//	r.setvaluex(0);
//	r.show();
//}
//	


	  // ** Program when Global & Local Variable is same
	
//	int i;
//	void setvaluex(int x)
//	{
//	   i=i;
//	}
//	void show ()
//	{
//		System.out.println(i);
//	}
//	public static void main(String[] args) {
//		 ThisKeyword r =new ThisKeyword();
//		r.setvaluex(100);
//		r.show();
//	}
	
	
	// ** Program 3 by using This Keyword
//	int i;
//	void setvaluex(int i)
//	{
//		this.i=i;
//	}
//	void show ()
//	{
//		System.out.println(i);
//	}
//	public static void main(String[] args) {
//		ThisKeyword r =new ThisKeyword();
//		r.setvaluex(100);
//		r.show();
//	}
	
	
	// **  Program 4
	
	
//		int rollNumber;             //global
//		
//		 ThisKeyword (int rollNumber)       //local
//		{
//			this.rollNumber =rollNumber;        
//		}
//		
//		public  void print()
//		{
//			System.out.println(rollNumber);
//		}
//		
//		public static  void main(String[] args) 
//	{
//			
//			ThisKeyword x = new ThisKeyword(101);
//			x.print();
			
		
	// ** Program to check "This" keyword refers same object.
	
	
//	void show()
//	{
//		System.out.println(this);
//	}
//	public static void main(String[] args)
//	{
//		ThisKeyword r = new ThisKeyword();
//		 r.show();
//		
//		System.out.println(r);
	
	
	
	
	
	// ** this keyword used to call default const of same class/
	
	
//	ThisKeyword()   // Default Const of this class
//	{
//		System.out.println("Velocity");
//	}
//	
//	ThisKeyword (int a)   // Parameterized const
//	{
//		
//		this();
//		System.out.println(a);
//		
//		
//	}
//	public static void main(String[] args) 
//	{
//		
//		ThisKeyword r = new ThisKeyword(100);
//		
//	}
	
	
	
	// *** // ** this keyword used to call Parameterized const of same class/
	
	
	
//	ThisKeyword()   // Default Const of this class
//	{
//		
//		this(10);
//		System.out.println("Velocity");
//	}
//	
//	ThisKeyword (int a)   // Parameterized const
//	{
//		
//		
//		System.out.println(a);
//		
//		
//	}
//	public static void main(String[] args) 
//	{
//		
//		ThisKeyword r = new ThisKeyword();
//		
//	}

	
	
	
	

	
	
	
	



}