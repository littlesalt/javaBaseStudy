package per.base.gul;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class TestPaint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new MyPaint().launchFrame();
	}
}
	class MyPaint extends Frame{
		public void launchFrame()
		{
			setBounds(200,200,640,480);
			setVisible(true);
		}
	
		@Override
		public void paint(Graphics g) {

		
			g.setColor(Color.red);
			g.fillOval(100,100,100,100);
			g.setColor(Color.green);
			g.fillRect(150,200,200,200);
			
			Color c=g.getColor();
			g.setColor(c);
		}
	}
