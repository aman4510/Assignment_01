class Helper {

	static int howsthedeal(int a, int b)
	{
		return a * b;
	}

	static double howsthedeal(double a, double b)
	{
		return a * b;
	}
}

class Q5a 
{
	public static void main(String[] args)
	{
		System.out.println(Helper.howsthedeal(2, 4));
		System.out.println(Helper.howsthedeal(5.5, 6.3));
	}
}
