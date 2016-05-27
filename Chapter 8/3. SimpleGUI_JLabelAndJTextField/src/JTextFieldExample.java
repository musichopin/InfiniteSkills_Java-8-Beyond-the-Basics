import javax.swing.JTextField;


public class JTextFieldExample extends JTextField
{

	public JTextFieldExample(String text, int width)
	{
		super(text); //	setText(text); denebilirdi
//		calls the JTextField(String text) constructor
		setColumns(width);
	}
}
