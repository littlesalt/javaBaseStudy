package per.base.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestBufferStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		FileInputStream fis=null;
		
		try {
			fis=new FileInputStream("F:\\java project\\javaBaseStudy\\src\\per\\base\\io\\test");
			
			BufferedInputStream bis=new BufferedInputStream(fis);
			
			int c=0;
			
			System.out.println((char)(bis.read()));

			bis.mark(100);
			
			for(int i=0;i<=100&&((c=bis.read())!=-1);i++){
				
				System.out.println((char)c);
			}
			System.out.println();
			bis.reset();
			System.out.println("-----------------------------------------------------------");
			for(int i=0;i<=100&&((c=bis.read())!=-1);i++){
				
				System.out.println((char)c);
			}
			bis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
