interface TestInterface
{
	public void msg(String str);

	default void defmethod()
	{
		System.out.println("Default Method Executed");
	}
}

class Q16 implements TestInterface
{
	public void msg(String str)
	{
		System.out.println(str);
	}

	public static void main(String args[])
	{
		Q16 d = new Q16();
		d.msg("How u doin..");

		d.defmethod();
	}
}

