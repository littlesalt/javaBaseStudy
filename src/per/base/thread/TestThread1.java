package per.base.thread;

public class TestThread1 {

	public static void main(String args[])
	{
		
		Runner1 r1=new Runner1();

//		r1.run();
		
		Thread t=new Thread(r1);
		
		t.start();
		
		for(int i=0;i<10;i++){
			System.out.println("mainthread:"+i);
		}
		
	}
	
	
	
}
class Runner1 implements Runnable{

	@Override
	public void run() {

		for(int i=0;i<10;i++)
		{
			System.out.println("Runner:"+i);
		}
	}
	

	
}
