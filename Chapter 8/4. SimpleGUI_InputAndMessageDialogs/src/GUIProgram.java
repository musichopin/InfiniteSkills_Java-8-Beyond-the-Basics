import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.*;


public class GUIProgram 
{
	public static final int width = 640;
	public static final int height = 480;
	
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try
				{
					JFrameExample jfe = new JFrameExample();

					JPanelExample jpe = new JPanelExample();
					jfe.getContentPane().add(jpe);
//					panel added to the frame
					
//					we get info from and to the user with JOptionPane
					String name = JOptionPane.showInputDialog("Please enter your name: ");
//					showMessageDialog'un showInputDialog'dan farký
//					textfield barýndýrmamasýdýr
					JOptionPane.showMessageDialog(null, "You entered the name: " + name);
					jpe.setTextFieldName(name);
//					JPanelExample'ýn constructor'ýnda pass edilmemesinin sebebi 
//					sýrayý bozacak olmamýz. bu nedenle yeni metodda pass ediliyor
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
	
}
