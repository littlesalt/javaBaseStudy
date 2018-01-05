package per.base.gul;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestWindowClose {
	 public static void main(String args[]){
	        new WindowFrame("�ر�WindowFrame");
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
	/*����������Ķ����������еĶ�����Ϣ��װ��һ�����󴫵ݵ�����������*/
	        
//	        this.addWindowListener(
//	        /*��һ���������涨��һ���࣬������Ϊ�ֲ��࣬Ҳ���������ڲ��࣬
//	        �����{�������롭��}����Ĵ������һ��������壬ֻ���������û�����֣����Խ�������
//	        �������ǰ���������൱��WindowAdapter����ʹ�ã��﷨������д�ı����������൱�����������
//	        ��WindowAdapter��̳У�����new��һ��������Ķ������Ȼ���������󵱳�WindowAdapter��ʹ��
//	        ������������()��û������ʶ��*/
//	            new WindowAdapter(){
//	                public void windowClosing(WindowEvent e){
//	                    setVisible(false);
//	                    System.exit(-1);
//	                }
//	            }
//	        );
	    }
	    
	    /*����Ҳ�ǽ������ඨ��Ϊ�ڲ���*/
	    class WindowMonitor extends WindowAdapter{
	        /*WindowAdapter(Window������)��ʵ����WindowListener�����ӿ�
	        ��д��WindowListener�ӿ���������з���
	        ���ֱ��ʹ���Զ���WindowMonitor��ֱ��ȥ
	        ʵ��WindowListener�ӿڣ���ô�͵�Ҫ��дWindowListener�ӿ�
	        ��������з�����������ֻ��Ҫ�õ���Щ�������������һ������
	        ���Բ��ü̳�ʵ��WindowListener�����ӿڵ�һ������
	        ����д�������������Ҫ�õ����Ǹ���������
	        ����������ֱ��ʵ��WindowListener�����ӿ�Ҫ��д�ܶ���ò����ķ���Ҫ��෽��ö�*/
	/*��д��Ҫ�õ���windowClosing(WindowEvent e)����*/
	        public void windowClosing(WindowEvent e){
	                setVisible(false);/*����������Ϊ����ʾ������ʵ�ִ���ر�*/
	                System.exit(0);/*�����˳�*/
	            }
	    }
	}