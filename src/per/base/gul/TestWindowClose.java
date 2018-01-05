package per.base.gul;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestWindowClose {
	 public static void main(String args[]){
	        new WindowFrame("关闭WindowFrame");
	    }
	}

	class WindowFrame extends Frame{
	    public WindowFrame(String s){
	        super(s);
	        setBounds(200,200,400,300);
	        setLayout(null);
	        setBackground(new Color(204,204,255));
	        setVisible(true);
	        this.addWindowListener(new WindowMonitor());
	/*监听本窗体的动作，把所有的动作信息封装成一个对象传递到监听类里面*/
	        
//	        this.addWindowListener(
//	        /*在一个方法里面定义一个类，这个类称为局部类，也叫匿名的内部类，
//	        这里的{……代码……}里面的代码很像一个类的类体，只不过这个类没有名字，所以叫匿名类
//	        在这里是把这个匿名类当成WindowAdapter类来使用，语法上这样写的本质意义是相当于这个匿名类
//	        从WindowAdapter类继承，现在new了一个匿名类的对象出来然后把这个对象当成WindowAdapter来使用
//	        这个匿名类出了()就没有人认识了*/
//	            new WindowAdapter(){
//	                public void windowClosing(WindowEvent e){
//	                    setVisible(false);
//	                    System.exit(-1);
//	                }
//	            }
//	        );
	    }
	    
	    /*这里也是将监听类定义为内部类*/
	    class WindowMonitor extends WindowAdapter{
	        /*WindowAdapter(Window适配器)类实现了WindowListener监听接口
	        重写了WindowListener接口里面的所有方法
	        如果直接使用自定义WindowMonitor类直接去
	        实现WindowListener接口，那么就得要重写WindowListener接口
	        里面的所有方法，但现在只需要用到这些方法里面的其中一个方法
	        所以采用继承实现WindowListener监听接口的一个子类
	        并重写这个子类里面需要用到的那个方法即可
	        这种做法比直接实现WindowListener监听接口要重写很多个用不到的方法要简洁方便得多*/
	/*重写需要用到的windowClosing(WindowEvent e)方法*/
	        public void windowClosing(WindowEvent e){
	                setVisible(false);/*将窗体设置为不显示，即可实现窗体关闭*/
	                System.exit(0);/*正常退出*/
	            }
	    }
	}