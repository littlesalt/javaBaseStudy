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
			System.out.println("ϵͳ�Ҳ���ָ���ļ���");
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
			System.out.println("�ܹ���ȡ��"+num+"���ֽڵ��ļ�");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�ļ���ȡ����");
		}
	}

}
