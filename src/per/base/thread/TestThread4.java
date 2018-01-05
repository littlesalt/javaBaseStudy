package per.base.thread;

public class TestThread4 {
	//join方法的使用
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MyThread2 thread2=new MyThread2("mythread");
		thread2.start();
		
		try {
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("I am main Thread");
		}
		
	}

}
class MyThread2 extends Thread{
	
	MyThread2(String s)
	{
		super(s);
	}
	
	public void run(){
		for(int i=0;i<=5;i++)
		{
			System.out.println("I am a\t"+getName());
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
			
		}
	}
}
