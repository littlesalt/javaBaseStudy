package per.base.socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServerSocket {

	public static void main(String args[]) throws Exception{
		ServerSocket ss=new ServerSocket(6666);
		
		while(true){
			Socket s=ss.accept();
			
			System.out.println("A Client Connected!");
			
			DataInputStream dis=new DataInputStream(s.getInputStream());
			
			String str=dis.readUTF();
			
			System.out.println(str);
		}
	}
}
