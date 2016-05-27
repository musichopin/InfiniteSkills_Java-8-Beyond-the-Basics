import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;


public class ButtonPressAction implements ActionListener
{
	public void actionPerformed(ActionEvent arg0) {
//		we have multiple buttons that call this actionlistener
//		and we want to know which button calls to respond 
//		specifically for each button press.
//		that is why we cast the arg0 and return the object into a jbutton
//		getName metodu jbutton object sayesinde ulaþýlabiliyor
		JButton jb = (JButton)arg0.getSource();

//		showMessageDialog'un showInputDialog'dan farký
//		textfield barýndýrmamasýdýr
		JOptionPane.showMessageDialog(null, "Button: "
				+ jb.getName() + " pressed!");
//		jb.getName(): BUTTON_TWO
	}
	
}
