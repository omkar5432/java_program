package Home;

import java.io.FileWriter;

public class FIle_Writer {

	public static void main(String[] args) throws Exception
	{
		FileWriter f = new FileWriter("C:\\Users\\Omkar Thube\\OneDrive\\Desktop\\Fortune Cloud\\s.txt");
		f.write("File Writer");
		f.close();
	}

}
