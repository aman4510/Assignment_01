public class Q19   
{  
	public static void main(String args[])  
	{  
		recursiveDemo(10);  
	}  
	
	public static void recursiveDemo(int i)  
	{  
		while(i!=0)  
		{  
		i=i+1;  
		System.out.println(i);
		recursiveDemo(i);  
		}  
	}  
}  