import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class JPanelExample extends JPanel
{
	private JTextFieldExample jtfe;
	
	public JPanelExample()
	{
		setBorder(BorderFactory.createLineBorder(Color.black, 10, true));
		
		JLabel label1 = new JLabel("Please enter your name:");
//		panelde gözüküyor
		
		jtfe = new JTextFieldExample("Pamela", 30); // default text field
		add(label1);
//		jLabel and JTextField are added to the panel
		add(jtfe);
		
//		JButton allows us to create a new JButton and compose that into our panel/form
		JButton jb = new JButton("Press Me");
//		button doesn't do anything until ActionListener anonymous class is added
		
		jb.setName("BUTTON_ONE"); // "Press Me" yi override etmez (yerleri farklý)
		
//		***anonymous inner class kullanmak yerine ActionListener ý implement 
//		eden bir metod argument'te pass edilebilirdi***
		jb.addActionListener(new ActionListener(){
//			actionlistener responds to jbuttonpress event
			public void actionPerformed(ActionEvent arg0) {
//				actionPerformed is called when the button is pressed
				String name = JOptionPane.showInputDialog(null, "Please enter your name");
//				we pass inputdialogue to modify our form
				
				jtfe.setText(name);
//				sets the text box to what we write in pop-up dialogue			
//				and then shows the pop-up message 
//				(because JOptionPane.showMessageDialog is set later)
				
				JOptionPane.showMessageDialog(null, "Button: "
						+ jb.getName() + " pressed!");
			}
			
		});
		
		add(jb); // adds the button to the panel
		
//		if we want to reuse the action for some reason we would not be stuck 
//		re-hard coding that every single time we want a new button by creating 
//		our own class implementing ActionListener
		JButton jb2 = new JButton("Press Me Too!");
		jb2.setName("BUTTON_TWO");
		jb2.addActionListener(new ButtonPressAction());
		add(jb2); // adds to the panel
		
		JButton jb3 = new JButton("Press Me As Well!");
		jb3.setName("BUTTON_THREE");
		jb3.addActionListener(new ButtonPressAction());
		add(jb3); // adds to the panel
	}
	
//	public void setTextFieldName(String name)
//	{
//		if (jtfe == null) throw new IllegalStateException();
//		if (name == null) throw new IllegalArgumentException();
//		jtfe.setText(name);
//	}
}
