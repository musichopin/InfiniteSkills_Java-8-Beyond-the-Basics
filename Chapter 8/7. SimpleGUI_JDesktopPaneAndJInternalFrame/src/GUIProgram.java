import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;


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
//	            	launches MyApplication
	            	MyApplication myApp = new MyApplication();
//	            	we can set them here as well
//	            	but with the fact that we are managing the desktoppane manager
//	            	in myapplication class, runnable is a good place to display some info 
//	            	for the entire app
	            	myApp.setLocation(250,250);
	            	myApp.setSize(GUIProgram.width+20,GUIProgram.height+60);
	            	myApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            	myApp.setBounds(0, 0, GUIProgram.width+20,GUIProgram.height+60);
	            	myApp.setVisible(true);
	            } 
	            catch (Exception e) 
	            {
	            	e.printStackTrace();
	            }
	        }
	    });
    }
}
