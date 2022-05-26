import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		JTextField name= new JTextField("");
		name.setBounds(40,180,140,40);
		name.setVisible(true);
		
		JFrame window=new JFrame();
		window.setSize(400,400);
		window.setVisible(true);
		window.setLayout(null);
		
		JButton button= new JButton("Update Message");
		button.setSize(150,30);
		button.setBounds(40,40,140,40);
		button.setVisible(true);
		
		JLabel text= new JLabel("");
		text.setBounds(40,120,140,40);
		window.add(text);
		window.add(name);
		window.add(button);
		
		button.addActionListener(e -> text.setText("Hello "+ name.getText()	));
	}
}
