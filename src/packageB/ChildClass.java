package packageB;


	public class ChildClass extends ParentClass
	{
		//2.
		public void method1()
		{
			System.out.println("method1-childclass");
		}
		
		//main method
		public static void main(String[] args) 
		{
			//1.child class method will be executed
			ChildClass x = new ChildClass();
			x.method1();
			
			//2.child class method1 absent
			ChildClass y = new ChildClass();
			y.method1();	
			
		
	}

}
