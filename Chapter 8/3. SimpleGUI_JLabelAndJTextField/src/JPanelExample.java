import java.awt.Color;

import javax.swing.*;


public class JPanelExample extends JPanel
{

	public JPanelExample()
	{
		setBorder(BorderFactory.createLineBorder(Color.black, 10, true));
		
		
		
		/* 
		2nd method: 
		
		JLabel label1 = new JLabel("Please enter your name:");
		JTextField jtf1 = new JTextField("Edward");
		// constructor yerine jtf1.setText("Edward") yazýlabilirdi
		jtf1.setColumns(25);
		add(label1);
		add(jtf1);
		*/
		
		JLabel label1 = new JLabel("Please enter your name:");
		JTextFieldExample jtfe = new JTextFieldExample("Pamela", 30);
//		30: width of text field
		add(label1);
		add(jtfe);
//		jLabel and JTextField are added to the panel
	}
}
