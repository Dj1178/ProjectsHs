import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Main {

	public static void main(String[] args) {
		JFrame window=new JFrame();
		window.setSize(400,400);
		window.setVisible(true);
		window.setLayout(null);
		JLabel text=new JLabel("Your mother");
		text.setSize(90,90);
		text.setBounds(40,10,100,50);
		window.add(text);
		JButton button=new JButton("button");
		button.setSize(100,50);
		button.setLocation(900,110);
		button.setVisible(true);
		window.add(button);
		button.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	text.setText("Your father");
		    }
		});
	}
}