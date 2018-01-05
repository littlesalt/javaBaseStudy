package per.base.gul;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestTextField {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MyFrameTextField myFrameTextField=new MyFrameTextField();
		addWindowClosingEvent(myFrameTextField);
	}
	
	private static void addWindowClosingEvent(Frame f)
	{
		f.addWindowListener(new WindowAdapter() {
		
			@Override
			public void windowClosing(WindowEvent arg0)
			{
				System.exit(0);
				
			}
		});
		
	}

}

class MyFrameTextField extends Frame{
	
	MyFrameTextField()
	{

		TextField tf=new TextField();
		
		add(tf);
		
		tf.addActionListener(new Monitors());
		
		tf.setEchoChar('*');
		
		
		
		setVisible(true);
		
		pack();
		
	}
	
	
}

class Monitors implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {

		TextField tf=(TextField) e.getSource();
		
		System.out.println(tf.getText());
		
		tf.setText("");
		
	}
	
}

