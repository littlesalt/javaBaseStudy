package per.base.thread;
//�߳�����������
public class TestDeadLock implements Runnable{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestDeadLock td1=new TestDeadLock();
		TestDeadLock td2=new TestDeadLock();
		td1.flag=1;
		td2.flag=0;
		Thread t1=new Thread(td1);
		Thread t2=new Thread(td2);
		
		t1.setName("�߳�td1");
		t2.setName("�߳�td2");
		t1.start();
		t2.start();
		
	}

	public int flag=1;
	static Object o1=new Object(),o2=new Object();
	
	public void run(){
		
		System.out.println(Thread.currentThread().getName()+"��flag:"+flag);
		
		if(flag==1)
		{
			synchronized(o1){
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized(o2){
					System.out.println("1");
				}
				
			}
			
		}
		
		if(flag==0){
			synchronized(o2){
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				}
			synchronized(o1){
				System.out.println("0");
			}
			
			}
			
		}
	}
	
	
}
