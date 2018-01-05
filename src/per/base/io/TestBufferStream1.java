package per.base.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferStream1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	BufferedWriter bw=new BufferedWriter(new FileWriter("F:\\java project\\javaBaseStudy\\src\\per\\base\\io\\test"));
	
	String s=null;
	
	for(int i=0;i<100;i++)
	{
		s=String.valueOf(Math.random());
		bw.write(s);
		bw.newLine();
	}
	bw.flush();
	bw.close();
	
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
		
	}

}
