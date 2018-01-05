package per.base.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestObjectIo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		T t=new T();
		t.k=8;
		try {
			FileOutputStream fos=new FileOutputStream("F:\\java project\\javaBaseStudy\\src\\per\\base\\io\\TestObjectIo.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			oos.writeObject(t);
			
			oos.flush();
			oos.close();
			
			FileInputStream fis=new FileInputStream("F:\\java project\\javaBaseStudy\\src\\per\\base\\io\\TestObjectIo.txt");
			
			ObjectInputStream ois=new ObjectInputStream(fis);
			try {
				T tRead=(T) ois.readObject();
				
				System.out.println("d:"+tRead.d);
				System.out.println("k:"+tRead.k);
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

}

class T implements Serializable{
	int i=10;
	int j=9;
	double d=2.3;
	transient int k=15;
	
}
