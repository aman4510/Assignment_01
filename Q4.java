 class Q3
{
	public void howudoing(){
		System.out.println("Doing good.");
	}	
}

class Q4 extends Q3
{
	public void howudoing(){
		System.out.println("Doing good too!!");
	}

	public static void main(String ar[])
	{
		Q3 obj = new Q4();
		obj.howudoing();
	}
}