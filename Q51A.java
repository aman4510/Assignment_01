public class Q51A implements Runnable 
{
   public void run() 
   {
      System.out.println("Hello from a Runnable!");
   }
   
   public static void main(String args[]) 
   {
      (new Thread(new Q51A())).start();
   }
}