class father
{
	public void howudoing(){
		System.out.println("Doing good.");
	}	
}

class mother
{
	public void howudoing(){
		System.out.println("Doing good too!!");
	}
}

class Q3 extends father, mother{
	public static void main(String ar[])
	{
		Q3 obj = new Q3();
		obj.howudoing();
	}
}