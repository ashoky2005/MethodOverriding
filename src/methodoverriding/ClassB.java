package methodoverriding;

public class ClassB  extends ClassA    // Child Class inherit Parent Class
{
	void show( )
	{
		// super.show();  // This concept used is Super keyword Program
		System.out.println("Hello");
	}
	
	
	public static void main(String[] args)
	{
		ClassA  r = new ClassB();
		r.show(); 
		
		ClassB x = new ClassB();
		x.show();
		
		ClassA y = new ClassA();
	     y.show();
	}}
//		
//		
		/* "Hi" Impementation accr to object creation of respective class
		             Means jis class ka object create karenge usi class ke method ko 
		call karega agar hum super keyword use nahi karate hai to    */
		// 
		
		

	
	
	///    Program 2 By Passing an arguments
//	public class ClassB  extends ClassA 
// {
//	
//	void show(int a)
//	{
//		System.out.println("Hello");
//	}
//	
//	public static void main(String[] args) 
//	{
//		ClassB r = new ClassB();
//		r.show(10);
//		
//	}
	
	
	
	
	           // Program 3:- By using sequence of arguments.

//public class ClassB  extends ClassA 
//{
//    void show (int a , String b)
//    {
//    	System.out.println(" Hello");
//    }
//	
//    
//    public static void main(String[] args) 
//    {
//    	
//    	ClassB r = new ClassB();
//    	r .show(10, "AKY");
//    	
//    	
//    	ClassA y = new ClassA();
//  	//y.show(10, null);
//    	y.show(15, "Ashok");
//    	
//    	
//		
//	}
//	 }



//public class ClassB  extends ClassA 
//
//{
//	String  show()
//	{
//		System.out.println("Hello");
//		return null;
//	}
//	
//	public static void main(String[] args)
//	{
//		
//		ClassA y = new ClassA();
//		y.show();
//	
//	ClassB r = new ClassB();
//	r.show();
//}
	
//}

      

            // Case 2:- The scope of child class AM should be greater than Parent Class


//public class ClassB  extends ClassA 
//
//{
//	private void  show()    Not Accepted
	// Cannot reduce the visibility of the inherited method from ClassA
	
	//public void show()
//	public void show()   // Here AM scope is in whole Project
//	
//	{
//		System.out.println("Hello");
//		
//	}
//	
//	public static void main(String[] args)
//	{
//		
//		ParentClass y = new ParentClass();
//		y.show();
//	
//	ChildClass r = new ChildClass();
//	r.show();
//	}}





    





	
	
	
	