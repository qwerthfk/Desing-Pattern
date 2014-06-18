package Builder_Pattern.changeMakeTitle;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class FrameBuilder extends Builder implements ActionListener {
	
	private JFrame frm = new JFrame();
	private Box box = new Box(BoxLayout.Y_AXIS);
	
	public void actionPerformed(ActionEvent e) {
	  // TODO Auto-generated method stub
	  System.out.println(e.getActionCommand());
  }
	public void buildTitle(String title) {
	  // TODO Auto-generated method stub
	  frm.setTitle(title);
  }
	public void buildString(String str) {
	  // TODO Auto-generated method stub
	  box.add(new JLabel(str));
  }
	public void buildItems(String[] items) {
	  // TODO Auto-generated method stub
	  Box innerBox = new Box(BoxLayout.Y_AXIS);
	  for(int i=0; i<items.length; i++) {
	  	JButton button = new JButton(items[i]);
	  	button.addActionListener(this);
	  	innerBox.add(button);
	  }
	  box.add(innerBox);
  }
	public void buildDone() {
	  // TODO Auto-generated method stub
	  frm.getContentPane().add(box);
	  frm.pack();
	  frm.addWindowListener(new WindowAdapter() {
	  	public void windowClosing(WindowEvent e) {
	  		System.exit(0);
	  	}
	  });
  }
	
	public JFrame getResult() {
		return frm;
	}
	

}
