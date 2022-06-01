package methodoverriding;

public class ClassA 
{

////        Program :- 1

	void show( )    // Method of Super class
	{
		System.out.println("Hi");
	
	}
}



                   // Program 2 :- By Passing an arguments.


//package methodoverriding;
//
//public class ClassA 
//{
//	void show(int a)   
//	{
//		System.out.println("Hi");
//	
//	}
//}


                 // Program 3:By using sequence of arguments


//
//package methodoverriding;
//
//public class ClassA 
//{
//	void show(int a, String b)   
//	{
//		System.out.println("Hi");
//	
//	}}



        //**** There are different case can be asked in Interview:


       //Case 1:- Do overriding Method must have same return type(or Subtype) ?


//package methodoverriding;
//
//public class ClassA 
//{
//	Object show()   // Here return type is Object
//	{
//		System.out.println("Hi");
//		return null;
//	
//	}
//}


     // Case:-2 " Access Modifier scope of child class should be greater than Parent class


//package methodoverriding;



//public class ParentClass 
//{
//	protected void show()   // Here AM scope is within the package only
//	{
//		System.out.println("Hi");
//		
//	
//	}
//}











