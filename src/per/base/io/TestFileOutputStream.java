package per.base.io;

import java.io.*;

public class TestFileOutputStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int b=0;
		FileInputStream in=null;
		FileOutputStream out=null;
		
		try {
			in=new FileInputStream("F:\\java project\\javaBaseStudy\\src\\per\\base\\io\\test");
			
			out=new FileOutputStream("F:\\java project\\javaBaseStudy\\src\\per\\base\\io\\test2");
			
			while((b=in.read())!=-1){
				out.write(b);
			}
		in.close();
		out.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�ļ���ȡʧ�ܣ�");
			System.exit(-1);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�ļ�����ʧ��");
			System.exit(-1);
		}
		
		System.out.println("���Ƴɹ���");
	}

}
