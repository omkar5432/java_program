package Home;
import java.io.*;
import java.util.*;

public class fh2 {

	public static void main(String[] args) throws Exception
	{
		int ch=5;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Choice: ");
		ch = s.nextInt();

		FileInputStream f = new FileInputStream("C:\\Users\\Omkar Thube\\OneDrive\\Desktop\\Fortune Cloud\\f.txt");
		
		switch(ch)
		{
		case 1:
			int i =f.read();
			while((i=f.read())!=-1)
			{
				System.out.print((char)i);
			}
			break;
			
		case 2:
			FileOutputStream f1 = new FileOutputStream("C:\\Users\\Omkar Thube\\OneDrive\\Desktop\\Fortune Cloud\\f.txt");
			String name= "File Hnadling";
			
			byte b [] = name.getBytes();
			f1.write(b);
			f1.close();
			System.out.println("Record Saved..!!");
			break;
			
		case 3:
			FileReader f_ = new FileReader("C:\\Users\\Omkar Thube\\OneDrive\\Desktop\\Fortune Cloud\\f.txt");
			int r;
			while((r=f_
					.read())!=-1);
			{
				System.out.println((char)r);
			}
			
			break;
			
		}
		
		
		
	
	}

}
