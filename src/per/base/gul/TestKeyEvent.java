package per.base.gul;

import java.awt.*;
import java.awt.event.*;
public class TestKeyEvent{
    public static void main(String args[]){
        new KeyFrame("������Ӧ�¼�");
    }
}

class KeyFrame extends Frame{
    public KeyFrame(String s){
            super(s);
            setBounds(200,200,400,300);
            setLayout(null);
            setVisible(true);
            addKeyListener(new KeyMonitor());
        }
    /*���Զ���ļ��̵ļ����ඨ��Ϊ�ڲ���
    ���������Ӽ���������KeyAdapter��̳�
    ��KeyAdapter��̳�Ҳ��Ϊ�˿��Լ�෽��
    ֻ��Ҫ��д��Ҫ�õ��ķ������ɣ�����������
    ֱ��ʵ��KeyListener�ӿ�Ҫ�򵥷��㣬���
    ֱ��ʵ��KeyListener�ӿھ�Ҫ��KeyListener
    �ӿ���������з�����дһ�飬�������õ���
    ֻ��һ��������������д�����ķ��������ò���
    ����������ù�*/    
    class KeyMonitor extends KeyAdapter{
        public void keyPressed(KeyEvent e){
                int keycode = e.getKeyCode();
            /*ʹ��getKeyCode()������ȡ������������*/
            /*�����ȡ���ļ������������up����������
            ���ʾ��ǰ���µļ���up��
            KeyEvent.VK_UP��ʾȡ��up����������
            �����е�ÿһ��������Ӧ��һ��������
            ��Щ��������KeyEvent�����涼������Ϊ��̬����
            ���Կ���ʹ�á�����.��̬������������ʽ���ʵõ���Щ��̬����*/
                if(keycode == KeyEvent.VK_UP){
                        System.out.println("�㰴����up��");
                    }
            }
        }
}
/*���̵Ĵ����¼��������ģ�ÿһ��������Ӧ��һ��������룬
������ĳһ����ʱ��ϵͳ�ͻ�ȥ���������Ӧ��������룬�Դ���ȷ����ǰ���µ����Ǹ���
*/
