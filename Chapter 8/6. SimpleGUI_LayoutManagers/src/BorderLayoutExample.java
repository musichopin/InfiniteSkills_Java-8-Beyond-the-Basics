import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class BorderLayoutExample extends JFrame
// Jframei extend etmesi önemli
{

	public BorderLayoutExample()
	{
		//create a panel
		JPanel jp = new JPanel();
//		border layout is set as the layout
		jp.setLayout(new BorderLayout());
		JButton n = new JButton("Top");
		JButton e = new JButton("Right");
		JButton s = new JButton("Bottom");
		JButton w = new JButton("Left");
		JButton c = new JButton("Center");
//		we do not use actionlistener on these buttons 
//		in these set of examples		
//		if we wanted, we could create our actionlistener, 
//		name all these buttons specifically and then 
//		respond based on which button is being pressed
		
//		buttons are added to the panel
		jp.add(n, BorderLayout.NORTH);
		jp.add(e, BorderLayout.EAST);
		jp.add(s, BorderLayout.SOUTH);
		jp.add(w, BorderLayout.WEST);
		jp.add(c, BorderLayout.CENTER);
		
//		button panele, panel jframe eklendi
//		"this" refers to this object (for frame)
		this.getContentPane().add(jp);
//		getContentPane, JFrame classa ait

		this.setLocation(250,250);
    	this.setSize(GUIProgram.width+20,GUIProgram.height+60);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setTitle("Border Layout");
    	this.setBounds(0, 0, GUIProgram.width+20,GUIProgram.height+60);
    	this.setVisible(true);
		
	}
}
