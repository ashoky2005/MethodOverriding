package packageA;

public class ThisKeywords   
{
	
	// This Keywords
	
	// Program 1
	
	
//	int a,b;
//	public void sample (int a,int b)
//	{
//	this.a =a;
//		b=b;
//		System.out.println(a);
//		System.out.println(b);
//		
//	}
//	public static void main(String[] args)
//	{
//		
//		ThisKeywords r = new ThisKeywords();
//		r.sample(10, 20);
//	}
	
	
	
	
	
	//   Program 2
	
//	int i;
//	void input (int a)
//	{
//		i =a;
//	}
//	
//	void show ()
//	{
//		System.out.println(i);
//	}
//	public static void main(String[] args) 
//	{
//		ThisKeywords r = new ThisKeywords();
//		
//		r.input(10);
//		r.show();
	
	
	
	// **** Program 3
	
	// When Instance & Local Variable is same then output will be zero ie default value of Instance Variable
	
	
	
//	int i;
//	void input (int i)
//	{
//		i =i;
//	}
//	
//	void show ()
//	{
//		System.out.println(i);
//	}
//	public static void main(String[] args) 
//	{
//		ThisKeywords r = new ThisKeywords();
//		
//		r.input(10);
//		r.show();
	
	
	
	// *** To solve above issue we use "This" keyword when IV & LV is same
	
//	int i;
//	void input (int i)
//	{
//		this.i =i;
//	}
//	
//	void show ()
//	{
//		System.out.println(i);
//	}
//	public static void main(String[] args) 
//	{
//		ThisKeywords r = new ThisKeywords();
//		
//		r.input(10);
//		r.show();
//	}
	
	
	
	/* Instead of these "This" Keyword can be use in below mentioned conditions:--
	 * 1:-This Keyword can be use to refer current class instance variable.
	 * 2- This keyword use to invoke current class method.
	 * 3- this() can be use to invoke current class constructor.
	 * 4- it can be use to pass as an argument in the method call.
	 * 5- it can be use to pass as an argument in the constructor call.
	 * 6-  it can be used to return the current class instance from the method.
	 */
	
	
	
	// 1:-  This Keyword can be use to refer current class instance variable.
	
	
	

//	int i;
//	void input (int i)
//	{
//		this.i =i;
//	}
//	
//	void show ()
//	{
//		System.out.println(i);
//	}
//	public static void main(String[] args) 
//	{
//		ThisKeywords r = new ThisKeywords();
//		
//       r.input(10);
//		r.show();
//}

	
	// 2:- This keyword use to invoke current class method.
	
	
//	void display ()
//	{
//		System.out.println("Hello");
//	}
//	
//	void show ()
//	{
//		this.display (); // display();  
//		
//		/* (If we don't use the this keyword,
//		Compiler automatically adds this keyword while invoking the method) */
//	}
//	public static void main(String[] args) 
//	{
//		ThisKeywords r = new ThisKeywords();
//		r.show();
	
	
	
	// 3- this() can be use to invoke current class constructor.
	
	
//	
//	ThisKeywords()
//	{
//		
//		
//		System.out.println("Default Constructor");
//	}
//	
//	ThisKeywords(int a)
//	{
//	this();
//		System.out.println("Parameterised Constructor");
//	}
//	public static void main(String[] args) 
//	{
//		ThisKeywords r = new ThisKeywords();
	
	
	//           OR
		
		
//		ThisKeywords()
//		{
//			this(10);
//			
//			System.out.println("Default Constructor");
//		}
//		
//		ThisKeywords(int a)
//		{
//		
//			System.out.println("Parameterised Constructor");
//		}
//		public static void main(String[] args) 
//		{
//			ThisKeywords r = new ThisKeywords();
	

	
	
		
		// ** 4- it can be use to pass as an argument in the method call.
		


//	void m1(ThisKeywords r)
//	{
//	
//	System.out.println(" Method1");
//}
//
// void m2()
//{
//	 m1(this);
//
//
//	System.out.println(" Method2");
//}
//public static void main(String[] args) 
//{
//	ThisKeywords r = new ThisKeywords();
//	
//        r.m2();
//		
}

	

