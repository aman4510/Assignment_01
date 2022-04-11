class Parent 
{
	void whereareu()
	{
		System.out.println("In parent class");
	}
}

class sclass1 extends Parent 
{
	void whereareu() { 
		System.out.println("In sub class 1"); 
	}
}

class sclass2 extends Parent {

	void whereareu()
	{
		System.out.println("In sub class 2");
	}
}

class Q5b {

	public static void main(String[] args)
	{
		Parent a;

		a = new sclass1();
		a.whereareu();

		a = new sclass2();
		a.whereareu();
	}
}
