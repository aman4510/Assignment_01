import java.util.*;

class Q49 extends Thread 
{
	static int threadcount = 1;
	
	public void run()
	{
		System.out.println(threadcount + "st Child" + " Thread execution starts");
		System.out.println("Child thread execution completes");
		threadcount++;
	}
	
	public static void main(String[] args)	throws InterruptedException
	{
		System.out.println("Main thread execution starts");

		Q49 thread1 = new Q49();
		thread1.setPriority(10);
		
		Q49 thread2 = new Q49();
		thread2.setPriority(9);
		
		Q49 thread3 = new Q49();
		thread3.setPriority(8);
		
		Q49 thread4 = new Q49();
		thread4.setPriority(7);
		
		Q49 thread5 = new Q49();
		thread5.setPriority(6);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();

		System.out.println("Main thread execution completes");
	}
}
