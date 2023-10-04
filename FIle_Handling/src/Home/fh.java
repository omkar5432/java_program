package Home;
import java.io.*;
public class fh {						//FileOutputStream

	public static void main(String[] args) throws Exception
	{
		FileOutputStream f = new FileOutputStream("C:\\Users\\Omkar Thube\\OneDrive\\Desktop\\Fortune Cloud\\f.txt");
		String name= "File Hnadling";
		
		byte b [] = name.getBytes();
		f.write(b);
		f.close();
	}

}
