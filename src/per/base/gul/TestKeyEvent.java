package per.base.gul;

import java.awt.*;
import java.awt.event.*;
public class TestKeyEvent{
    public static void main(String args[]){
        new KeyFrame("键盘响应事件");
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
    /*把自定义的键盘的监听类定义为内部类
    这个监听类从键盘适配器KeyAdapter类继承
    从KeyAdapter类继承也是为了可以简洁方便
    只需要重写需要用到的方法即可，这种做法比
    直接实现KeyListener接口要简单方便，如果
    直接实现KeyListener接口就要把KeyListener
    接口里面的所有方法重写一遍，但真正用到的
    只有一个方法，这样重写其他的方法但又用不到
    难免会做无用功*/    
    class KeyMonitor extends KeyAdapter{
        public void keyPressed(KeyEvent e){
                int keycode = e.getKeyCode();
            /*使用getKeyCode()方法获取按键的虚拟码*/
            /*如果获取到的键的虚拟码等于up键的虚拟码
            则表示当前按下的键是up键
            KeyEvent.VK_UP表示取得up键的虚拟码
            键盘中的每一个键都对应有一个虚拟码
            这些虚拟码在KeyEvent类里面都被定义为静态常量
            所以可以使用“类名.静态常量名”的形式访问得到这些静态常量*/
                if(keycode == KeyEvent.VK_UP){
                        System.out.println("你按的是up键");
                    }
            }
        }
}
/*键盘的处理事件是这样的：每一个键都对应着一个虚拟的码，
当按下某一个键时，系统就会去找这个键对应的虚拟的码，以此来确定当前按下的是那个键
*/
