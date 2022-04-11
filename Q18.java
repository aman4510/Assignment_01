// Checked Exceptions
// Where FileNotFoundException occured

import java.io.*;

class Q18 {

	public static void main(String[] args) throws IOException
	{
		FileReader file = new FileReader("C:\\Users\\Lenovo\\Desktop\\CUF\\links.txt");

		BufferedReader fileInput = new BufferedReader(file);

		for (int counter = 0; counter < 3; counter++)
			System.out.println(fileInput.readLine());

		fileInput.close();
		
		// Unchecked Exception.
		
		
		int x = 0;
		int y = 10;
		int z = y / x;
		
		System.out.println(z);
	}
}

