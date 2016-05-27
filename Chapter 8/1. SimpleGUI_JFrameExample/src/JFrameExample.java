import javax.swing.JFrame;


public class JFrameExample extends JFrame
//	this class allows us to do some separation of the composition of the  
//	components in java GUI program
{

	public JFrameExample() // constructor

	{ // we can make our composition within the constructor 
		setLocation(250,250);
		setSize(GUIProgram.width + 20, GUIProgram.height + 60);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("My JFrame Example");
		setBounds(0, 0, GUIProgram.width + 20, GUIProgram.height + 60);
//		setBounds; setLocation ile setSize'ýn birleþimi gibi
		setVisible(true);
	}
}
