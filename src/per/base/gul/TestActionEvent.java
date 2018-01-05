package per.base.gul;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestActionEvent {

	/**
	 * @param args123
	 */
	public static void main(String[] args) {

		Frame f=new Frame("TestActionEvent");
		
		Button btn=new Button("Press me");
		
		Monitor m=new Monitor();
		btn.addActionListener(m);
		
		f.add(btn, BorderLayout.CENTER);
		
		f.pack();
		
		addWindowClosingEvent(f);
		
		f.setVisible(true);
		
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

class Monitor implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println("A Button has been Pressed");
		
	}
}

