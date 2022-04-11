import java.io.File;

public class Q23 
{
       public static void main(String[] args) 
	   {
			File my_file_dir = new File("C:\\Users\\Lenovo\\Desktop\\Assignment 01\\Q23.java");
			
			if (my_file_dir.exists()) 
			{
				System.out.println("The directory or file exists.\n");
			} 
			else
			{
				System.out.println("The directory or file does not exist.\n");
			}
       }
  }
