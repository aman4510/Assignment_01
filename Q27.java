import java.io.File;
import java.util.Date;

public class Q27 
{
       public static void main(String[] args) 
	   {
		   File file = new File("C:\\Users\\Lenovo\\Desktop\\Assignment 01\\Q27.java");
		   Date date = new Date(file.lastModified());
		   System.out.println("\nThe file was last modified on: "+date+"\n");	   
     }
}
