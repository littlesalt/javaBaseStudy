package per.base.thread;
/*�������ƣ�������-����������
 * Դ�ļ����ƣ�ProducerConsumer.java
 * Ҫ�㣺
 * 	1.�������ݵĲ�һ��/�ٽ���Դ�ı���
 * 	2.Java�������ĸ���
 * 	3.synchronized�ؼ���/wait()��notify()����
 */
public class ProducerConsumer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		SyncStack stack=new SyncStack();
		Runnable p=new Producer(stack);
		Runnable c=new Consumer(stack);
		Thread p1=new Thread(p);
		Thread c1=new Thread(c);
		p1.start();
		c1.start();
		
	}

}
class SyncStack{
	
	private int index=0;
	private char[] data=new char[6];
	public synchronized void push(char c){
		if(index==data.length){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.notify();
		data[index]=c;
		index++;
	}
	
	public synchronized char pop(){
		
		if(index==0){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		this.notify();
		index--;
		return data[index];
	}
}
class Consumer implements Runnable{
	SyncStack stack;
	
	public Consumer(SyncStack s){
		stack=s;
	}
	
	@Override
	public void run() {

		for(int i=0;i<20;i++){
			char c=stack.pop();
			System.out.println("���ѣ�"+c);
			try {
				Thread.sleep((int)Math.random()*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class Producer implements Runnable{

	SyncStack stack;
	
	public Producer(SyncStack s){
		stack=s;
	}
	
	@Override
	public void run() {

		for(int i=0;i<20;i++){
			char c=(char) (Math.random()*26+'A');
			stack.push(c);
			System.out.println("produced:"+c);
			
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
	
}

