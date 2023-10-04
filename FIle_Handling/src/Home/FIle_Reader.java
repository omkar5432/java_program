package Home;

import java.io.FileReader;

public class FIle_Reader {

	public static void main(String[] args) throws Exception
	{
		FileReader f = new FileReader("C:\\Users\\Omkar Thube\\OneDrive\\Desktop\\Fortune Cloud\\f.txt");
		int r;
		while((r=f.read())!=-1);
		{
			System.out.println((char)r);
		}
		
	}

}
