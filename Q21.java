import java.io.File;
import java.util.Date;

public class Q21 
{
     public static void main(String a[])
     {
        File file = new File("C:\\Users\\Lenovo\\Desktop\\Assignment 01");
		
        String[] fileList = file.list();
		
        for(String name : fileList)
		{
            System.out.println(name);
        }
    }
}