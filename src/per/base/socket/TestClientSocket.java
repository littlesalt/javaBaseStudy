package per.base.socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestClientSocket {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		String address="192.168.180.101";
		int port=6666;
		try {
			Socket s =new Socket(address, port);
			
			OutputStream os=s.getOutputStream();
			
			DataOutputStream dos=new DataOutputStream(os);
			
		    Thread.sleep(30000);
			
			dos.writeUTF("Hello Server!");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
