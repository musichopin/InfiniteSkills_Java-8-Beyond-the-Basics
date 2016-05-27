import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;


public class JPanelExample extends JPanel
{

	public JPanelExample()
	{
		setBorder(BorderFactory.createLineBorder(Color.black, 10, true));
//		black: color | 10: width | true: for rounded corners
	}
}
