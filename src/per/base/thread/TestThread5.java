package per.base.thread;

public class TestThread5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MyThread3 t1=new MyThread3("t1");
		
		MyThread3 t2=new MyThread3("t2");
		
		t1.start();
		t2.start();
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("I am main Thread");
		}
	}

}
class MyThread3 extends Thread{
	
	MyThread3(String s)
	{
		super(s);
	}
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(getName()+":"+i);
			
			if(i%2==0)
			{
				yield();
			}
		}
		
	}
	
}