package per.base.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class TestPrintStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		PrintStream ps=null;
		
		try {
			FileOutputStream fos=new FileOutputStream("F:\\java project\\javaBaseStudy\\src\\per\\base\\io\\test");
			
			ps=new PrintStream(fos);
			
			if(ps!=null)
			{
				System.setOut(ps);
			}
			
			for(char c=0;c<=60000;c++)
			{
				System.out.print(c+"\t");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
