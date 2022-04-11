class Demo
{
	Demo(){
		System.out.println("Constructor called.");
	}
	Demo(int num){
		System.out.println(num);
	}
}

class Q1{
	public static void main(String args[])
	{
		Demo d1 = new Demo();
		Demo d2 = new Demo(5);
	}
}


