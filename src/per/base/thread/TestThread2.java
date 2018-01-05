package per.base.thread;

public class TestThread2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Thread1 t1=new Thread1();
		
		t1.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("mianMethod:"+i);
		}
		
		
	}

}

class Thread1 extends Thread{
	
	public void run(){
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Thread:"+i);
		}
	}
	
}
