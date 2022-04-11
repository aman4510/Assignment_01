public class Q2
{
   int num;
   int def;
   Q2()
   {
      num = 100;
   }
   Q2(int num)
   {
      this.num = num;
   }
   public static void main(String args[])
   {
	  System.out.println(new Q2().def); //0 (initialized by default constructor)
      System.out.println(new Q2().num);
      System.out.println(new Q2(1000).num);
   }
}