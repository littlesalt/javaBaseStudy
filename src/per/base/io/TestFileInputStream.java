package per.base.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileInputStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int b=0;
		FileInputStream in=null;
		String fileName="F:\\java project\\javaBaseStudy\\src\\per\\base\\io\\test";
		try {
			in =new FileInputStream(fileName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("系统找不到指定文件！");
			System.exit(-1);
		}
		
		long num=0;
		try {
			while((b=in.read())!=-1)
			{
				System.out.print((char)b);
				num++;
			}
			
			in.close();
			System.out.println();
			System.out.println("总共读取了"+num+"个字节的文件");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("文件读取错误！");
		}
	}

}
